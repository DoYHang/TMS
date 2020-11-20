package com.buct.matlab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ReadResult {
	public static String readFile(String filename) throws IOException {
			
		File file1 = new File(filename);//涓�绾ф枃浠跺す
		BufferedReader reader;
		reader = new BufferedReader(new FileReader(filename));
		String result = "";
		String line = reader.readLine();
		while(line != null){
			result += line+"\n";
			line = reader.readLine();
		}
		return result;
		
	}
}
