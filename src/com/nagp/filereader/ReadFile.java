package com.nagp.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile {
	String line;
	public String readPassword() {
		BufferedReader reader;
		
		try {
			reader = new BufferedReader(new FileReader(
					"./myFile.txt"));
			line = reader.readLine();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return line;
	}
}