package com.mani.gayi.db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.mani.gayi.utils.HexUtil;

public class LicenseImportUtility {


	private Connection connection;

	private byte[] signKeyStore;

	private byte[] certKeyStore;

	private String license;

	private int licenseId;

	private int versionId;

	/**
	 * Constructor
	 */
	public LicenseImportUtility() {

	}

	/**
	 * Import the license to specified DB
	 * 
	 * @param dbURL
	 * @param userName
	 * @param password
	 * @param licenseAbsPath
	 * @throws Exception
	 */
	public void importLicense(String dbURL, String userName, String password,
			String licenseAbsPath) throws Exception {
		Connection connection = createConnection(dbURL, userName, password);
		String license = readLicenseFile(licenseAbsPath);
		importLicense(connection, license);
		closeConnection(connection);
	}

	/**
	 * Import the license to specified DB
	 * 
	 * @param connection
	 * @param licenseData
	 * @throws Exception
	 */
	public void importLicense(Connection connection, String license)
			throws Exception {
		this.connection = connection;
		loadLicenseRecord(license);
		if (doesLicenseExist()) {
			updateLicense();
		} else {
			licenseId = generateLicenseId();
			insertLicense();
		}
	}

	/**
	 * Create the DB connection
	 */
	private Connection createConnection(String dbURL, String userName,
			String password) throws Exception {
		loadDBDriver(dbURL);
		return DriverManager.getConnection(dbURL, userName, password);
	}

	/**
	 * Load the DB driver
	 */
	private void loadDBDriver(String dbURL) throws Exception {
		String dbDriver = null;
		String temp_dbURL = dbURL.toLowerCase();
		if (temp_dbURL.contains("oracle")) {
			dbDriver = "oracle.jdbc.driver.OracleDriver";
		} else if (temp_dbURL.contains("db2")) {
			dbDriver = "com.ibm.db2.jcc.DB2Driver";
		} else if (temp_dbURL.contains("informix")) {
			dbDriver = "com.informix.jdbc.IfxDriver";
		} else {
			throw new IOException();
		}
		Class.forName(dbDriver);
	}

	/**
	 * Close the connection
	 */
	public static void closeConnection(Connection connection) {
		if (null != connection) {
			try {
				connection.close();
			} catch (SQLException e) {
				// Nothing to do...
			}
		}
	}

	/**
	 * Load the license data
	 */
	private void loadLicenseRecord(String licenseData) {
		int signEndIndex = licenseData.indexOf(19);
		if (-1 != signEndIndex) {
			signKeyStore = HexUtil.hexToBytes(licenseData.substring(0,
					signEndIndex));
		}
		int certEndIndex = licenseData.indexOf(19, signEndIndex + 1);
		if (-1 != certEndIndex) {
			certKeyStore = HexUtil.hexToBytes(licenseData.substring(
					signEndIndex + 1, certEndIndex));
		}
		license = licenseData.substring(certEndIndex + 1, licenseData.length());
	}

	/**
	 * Read the license file
	 * @throws IOException 
	 */
	private String readLicenseFile(String licenseFile) throws IOException {
		String licenseData = null;

		BufferedReader bufferedReader = null;
		try {
			File file = new File(licenseFile);
			if (file.exists()) {
				FileInputStream f = new FileInputStream(file);
				bufferedReader = new BufferedReader(new InputStreamReader(f,
						"UTF-8"));
				int length = (int) file.length();
				char[] thisLine = new char[length];
				bufferedReader.read(thisLine, 0, length);
				licenseData = new String(thisLine);
			}
		} catch (Exception e) {
			throw new IOException();
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (Exception e) {

				}
			}
		}

		if (null == licenseData || 0 == licenseData.length()) {
			throw new IOException();
		}

		return licenseData;
	}

	/**
	 * Does license exist
	 */
	private boolean doesLicenseExist() throws Exception {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = connection
					.prepareStatement("SELECT LICENSE_ID, VERSION_ID FROM LICENSE");
			rs = ps.executeQuery();
			while (rs.next()) {
				licenseId = rs.getInt(1);
				versionId = rs.getInt(2);
				return true;
			}
		} finally {
			closeStatement(ps, rs);
		}

		return false;
	}

	/**
	 * Generate the license id
	 * @throws IOException 
	 */
	private int generateLicenseId() throws IOException {
		CallableStatement cs = null;
		try {
			cs = connection.prepareCall("{call seqnextval(?,?)}");
			cs.setString(1, "SEQ_LICENSE_ID");
			cs.registerOutParameter(2, Types.INTEGER);
			cs.execute();
			return cs.getInt(2);
		} catch (SQLException e) {
			throw new IOException();
		} finally {
			closeStatement(cs, null);
		}
	}

	/**
	 * Insert the license
	 * @throws IOException 
	 */
	private void insertLicense() throws IOException {
		PreparedStatement ps = null;
		StringBuffer statement = new StringBuffer();
		statement.append("INSERT INTO LICENSE (LICENSE_ID, LICENSE_KEY, ");
		statement.append("CREATED_SOURCE_TYPE_ID, CREATED_SOURCE, ");
		statement.append("CREATED_DTTM, LAST_UPDATED_SOURCE_TYPE_ID, ");
		statement.append("LAST_UPDATED_SOURCE, LAST_UPDATED_DTTM, ");
		statement.append("VERSION_ID, SIGN_KEYSTORE, CERT_KEYSTORE) VALUES(");
		statement.append(licenseId);
		statement.append(", '");
		statement.append(license);
		statement.append("', 1, 'MANH', GETDATE() , 1, 'MANH', GETDATE(), ");
		statement.append(++versionId);
		statement.append(" ,?, ?)");
		try {
			ps = connection.prepareStatement(statement.toString());
			ps.setBytes(1, signKeyStore);
			ps.setBytes(2, certKeyStore);
			if (ps.executeUpdate() == 0) {
				throw new IOException();
			}
		} catch (SQLException e) {
			try {
				throw new IOException();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			closeStatement(ps, null);
		}
	}

	/**
	 * Update the existing license
	 * @throws IOException 
	 */
	private void updateLicense() throws IOException {
		PreparedStatement ps = null;
		StringBuffer statement = new StringBuffer();
		statement.append("UPDATE LICENSE SET LICENSE_KEY='");
		statement.append(license);
		statement.append("', SIGN_KEYSTORE=?, CERT_KEYSTORE=?, VERSION_ID=");
		statement.append(++versionId);
		statement.append(", LAST_UPDATED_DTTM=GETDATE()");
		try {
			ps = connection.prepareStatement(statement.toString());
			ps.setBytes(1, signKeyStore);
			ps.setBytes(2, certKeyStore);
			if (ps.executeUpdate() == 0) {
				throw new IOException();
			}
		} catch (SQLException e) {
			throw new IOException();
		} finally {
			closeStatement(ps, null);
		}
	}

	/**
	 * Close the statement
	 */
	private void closeStatement(PreparedStatement ps, ResultSet rs) {
		if (null != rs) {
			try {
				rs.close();
			} catch (SQLException e) {
				// Nothing to do...
			}
		}
		if (null != ps) {
			try {
				ps.close();
			} catch (SQLException e) {
				// Nothing to do...
			}
		}
	}

	/**
	 * reads the file contents into a String object
	 * 
	 * @param uploadFilePath
	 *            file path
	 * @return String containing the file contents
	 * @throws IOException 
	 */
	public String getFileData(String uploadFilePath) throws IOException {
		File file = new File(uploadFilePath);
		StringBuffer fileData = new StringBuffer(128);
		// Convert the file object to a URL
		URL url = null;
		try {
			url = file.toURL();
			InputStream is = url.openStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is,
					"UTF-8"));
			String s = br.readLine();
			while (null != s) {
				fileData.append(s);
				s = br.readLine();
			}
			if (s == null) {
				br.close();
			}
		} catch (IOException e) {
			throw new IOException();
		}
		return fileData.toString();
	}

	/**
	 * Allow invoking the class explicitly
	 */
	public static void main(String[] args) throws Exception {
		LicenseImportUtility util = new LicenseImportUtility();
		util.importLicense("jdbc:oracle:thin:@PSOUSDB02.asia.manh.com:1521:ORA12CDB12","UMLNWM2012RU7GALAXY", "UMLNWM2012RU7GALAXY", "C:\\WMSCPP\\MATLAN\\Project\\java_2012_R7\\WM-profile\\tools-wmserver\\scpp\\umln_local_env_india_manh_scpp.lic");
		System.out
				.println("License has been successfully imported. LicenseId: "
						+ util.licenseId);
		System.out.println();
	}
}
