package com.jk.jdk.j2se.io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		FileReader textFileReader = null;
		
		try {
			textFileReader = new FileReader(".project");
			char[] buffer = new char[8096];
			int numberOfCharsRead = 0;
			
			while ((numberOfCharsRead = textFileReader.read(buffer)) != -1) {
				//System.out.println(String.valueOf(buffer, 0, numberOfCharsRead));
				System.out.println(buffer);
				numberOfCharsRead = textFileReader.read(buffer);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			textFileReader.close();
		}
	}
}
