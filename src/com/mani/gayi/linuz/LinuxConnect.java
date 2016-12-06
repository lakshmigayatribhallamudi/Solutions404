package com.mani.gayi.linuz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.trilead.ssh2.Connection;
import com.trilead.ssh2.Session;
import com.trilead.ssh2.StreamGobbler;

public class LinuxConnect {

	public static void main(String args[]) throws IOException, InterruptedException {
		
		int count =0;
		System.out.println("Connection");
		Connection connection = new Connection("10.100.166.123", 22);
		connection.connect();
		if(!connection.authenticateWithPassword("wmsadmin", "wmsadmin"))
		{
			throw new IOException("Authentication failed.");
		}
		else
		{
			System.out.println("Connected");
			Session session = connection.openSession();
			session.execCommand("grep -nrw '/u30/USEI_GOLD/wms/tools/bin' -e 'MANH_WHSE_UPDATE'");
			
			String filename = null;
			StreamGobbler stdout = new StreamGobbler(session.getStdout());

	        BufferedReader br = new BufferedReader(new InputStreamReader(stdout));
	        while ((filename =br.readLine())!=null)
			System.out.println((++count)+":"+filename);
		}
		

	}


}
