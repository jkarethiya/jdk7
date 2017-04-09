package com.jk.jdk.j2se.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferdReaderTest {
	public static void main(String[] args) {
		String fileName = ".settings\\org.eclipse.core.resources.prefs";
		
		readFileLineByLine(fileName);
	}
	
	public static void readFileUsingBuffer(String fileName) {
		try {
			FileReader textFileReader = new FileReader(fileName);
			BufferedReader bufReader = new BufferedReader(textFileReader);
			char[] buffer = new char[8096];
			int numberOfCharsRead = bufReader.read(buffer);

			while (numberOfCharsRead != -1) {
				System.out.println(String.valueOf(buffer, 0, numberOfCharsRead));
				numberOfCharsRead = textFileReader.read(buffer);
			}
			bufReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readFileLineByLine(String fileName) {
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
