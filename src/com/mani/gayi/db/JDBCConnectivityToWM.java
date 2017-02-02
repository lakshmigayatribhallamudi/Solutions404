package com.mani.gayi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectivityToWM {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			// DriverManager.registerDriver(new Oracle:jdbc:OracleDriver());

			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@challenger.us.manh.com:1524:pso11r2o";
			conn = DriverManager.getConnection(url, "PSDIWDCDEVWM", "PSDIWDCDEVWM");
			if (conn != null) {
				System.out.println("Connection is found");

				double volume = 20.0 * 30.0 * 10.0;

				// *****************making custbase changes to incorporate UOM
				// conversion of volume when its set to
				// CBM***********************//
				// DB Column Names...
				String paramId_vol = "base_volume_uom";
				String paramId_dim = "base_dimension_uom";

				// DB Values for volume and dimmensions...
				String vol_units = Misc.EMPTY_STRING;
				String dim_units = Misc.EMPTY_STRING;

				// Getting the tcCompanyId from the manifest object.
				Integer tcCompanyId = 1;

				vol_units = checkForCompanyParam(paramId_vol, tcCompanyId, conn);

				dim_units = checkForCompanyParam(paramId_dim, tcCompanyId, conn);

				System.out.println("Vol Units " + vol_units + "  dim units " + dim_units);

				if (!Misc.isNullString(vol_units) && !Misc.isNullString(dim_units) && (vol_units != dim_units)) {
					// get the unit Details...
					String size_uom_vol_units = checkForSizeUOM(Integer.parseInt(vol_units), tcCompanyId, conn);
					String size_uom_dim_units = checkForSizeUOM(Integer.parseInt(dim_units), tcCompanyId, conn);

					if ((size_uom_vol_units.trim().equalsIgnoreCase("cbm"))
							&& (size_uom_dim_units.trim().equalsIgnoreCase("cm"))) {
						System.out.println("cbm->cm" + volume * 0.000001);
					}
					if ((size_uom_vol_units.trim().equalsIgnoreCase("cbm"))
							&& (size_uom_dim_units.trim().equalsIgnoreCase("inch"))) {
						System.out.println("cbm->inch" + volume * 0.00001638706);
					}
					if ((size_uom_vol_units.trim().equalsIgnoreCase("cu ft"))
							&& (size_uom_dim_units.trim().equalsIgnoreCase("cm"))) {
						System.out.println("cu ft->cm" + volume * 0.00003531467);
					}
					if ((size_uom_vol_units.trim().equalsIgnoreCase("cu ft"))
							&& (size_uom_dim_units.trim().equalsIgnoreCase("inch"))) {
						System.out.println("cu ft->inch" + volume * 0.000578704);
					}
					if ((size_uom_vol_units.trim().equalsIgnoreCase("Cu Inch"))
							&& (size_uom_dim_units.trim().equalsIgnoreCase("cm"))) {
						System.out.println("Cu Inch->cm" + volume * 0.06102374);
					}
				} else
					System.out.println("Volume " + volume);

			} else {
				System.out.println("Connection is not found");
			}

		}

		catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static String checkForCompanyParam(String paramDefID, Integer companyID, Connection conn) throws Exception {
		String returnValue = "";
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			if (Misc.isNullString(paramDefID) && Misc.isNullString(paramDefID)) {
				return returnValue;
			}
			ps = conn.prepareStatement(
					"Select PARAM_VALUE from COMPANY_PARAMETER where PARAM_DEF_ID in (?) and TC_COMPANY_ID = ?");
			ps.setString(1, paramDefID);
			ps.setInt(2, companyID);
			rs = ps.executeQuery();
			if (rs != null && rs.next()) {
				returnValue = rs.getString(1);

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			returnValue = "";
		} finally {

		}
		return returnValue;
	}

	private static String checkForSizeUOM(int i, Integer companyID, Connection conn) throws Exception {
		String returnValue = "";
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {

			ps = conn.prepareStatement("Select SIZE_UOM from SIZE_UOM where size_uom_id in (?) and TC_COMPANY_ID = ?");
			ps.setInt(1, i);
			ps.setInt(2, companyID);
			rs = ps.executeQuery();
			if (rs != null && rs.next()) {
				returnValue = rs.getString(1);

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			returnValue = "";
		} finally {

		}
		return returnValue;
	}

}
