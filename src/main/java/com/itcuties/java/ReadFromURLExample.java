package com.itcuties.java;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadFromURLExample {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.itcuties.com");
			InputStream is = url.openStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			String line;
			while ( (line = br.readLine()) != null)
				System.out.println(line);
			
			br.close();
			is.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
