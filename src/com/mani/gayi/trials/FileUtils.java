package com.mani.gayi.trials;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FileUtils {

	public static FileProperties createFileInGivenLocation(FileProperties createFileProperties) {
		{
			String File = createFileProperties.getLocation() + "/" + createFileProperties.getFileName();
			System.out.println("File::" + File);
			File stockFile = new File(File);
			createFileProperties.setExists(stockFile.exists());
			try {
				if (createFileProperties.isExists()) {
					System.out.println("*****File exists::*********");
				} else {
					stockFile.createNewFile();
					System.out.println("stock file" + stockFile.getPath() + " created ");
				}
			} catch (IOException ioe) {
				System.out.println("Error while Creating File in Java" + ioe);
			}

		}
		return createFileProperties;
	}

	public static void writeHashMapKeyAndValues(FileProperties createFileProperties, Map<String, String> hsh2) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		int count = 0;

		try {
			String filename = createFileProperties.getLocation() + "/" + createFileProperties.getFileName();

			fw = new FileWriter(filename,true);
			bw = new BufferedWriter(fw);

			Iterator it = hsh2.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry pair = (Map.Entry) it.next();
				bw.write((String) pair.getKey());
				bw.write("::" + (String) pair.getValue() + "\n"); 
				it.remove(); 
			}
			System.out.println("Done");
		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();
			}
		}
	}

	public static Map<String, String> readContentFromFileAndStoreItInHashMap(FileProperties createFileProperties,
			Map<String, String> hsh2) throws IOException {

		BufferedReader br = null;
		FileReader fr = null;

		try {
			String filename = createFileProperties.getLocation() + "/" + createFileProperties.getFileName();

			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			String s = br.readLine();
			String[] pair = s.split("::");
			hsh2.put(pair[0], pair[1]);
			System.out.println("s::" + s);
			String line = "";
			while ((line = br.readLine()) != null) {

				String[] pair1 = line.split("::");
				hsh2.put(pair1[0], pair1[1]);
			}

		} finally {
			br.close();

		}
		return hsh2;
	}
	
	public static void updateKeyValueInaFile(FileProperties createFileProperties,String key,String value) throws IOException
	{
		Map<String,String> hs=new HashMap<String,String>();
		hs=readContentFromFileAndStoreItInHashMap(createFileProperties, hs);
		Iterator it = hs.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String,String> pair = (Map.Entry) it.next();
			if(pair.getKey().equals(key))
			{
				pair.setValue(value);
			}
			else
			{
				hs.put(key, value);
			}
			
		}
			
		RewritewriteHashMapKeyAndValues(createFileProperties,hs);
	
	}
	
	
	public static void RewritewriteHashMapKeyAndValues(FileProperties createFileProperties, Map<String, String> hsh2) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		int count = 0;

		try {
			String filename = createFileProperties.getLocation() + "/" + createFileProperties.getFileName();

			fw = new FileWriter(filename);
			bw = new BufferedWriter(fw);

			Iterator it = hsh2.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry pair = (Map.Entry) it.next();
				bw.write((String) pair.getKey());
				bw.write("::" + (String) pair.getValue() + "\n"); 
				it.remove(); 
			}
			System.out.println("Done");
		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Map<String, String> hsh = new HashMap<String, String>();
		Map<String, String> hsh1 = new HashMap<String, String>();

		hsh.put("java", "1.8");
		hsh.put("git", "2.0");
		hsh.put("jenkins", "2.17");
		FileProperties cfp = new FileProperties();
		cfp.setFileName("mani.txt");
		cfp.setLocation("C:/File");
		//FileProperties cf = createFileInGivenLocation(cfp);
		//writeHashMapKeyAndValues(cf, hsh);
		//readContentFromFileAndStoreItInHashMap(cfp, hsh1);
		updateKeyValueInaFile(cfp,"java","103");

		Iterator it = hsh1.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(pair.getKey() + "****::****" + pair.getValue());
			it.remove(); 

		}

	}
}
