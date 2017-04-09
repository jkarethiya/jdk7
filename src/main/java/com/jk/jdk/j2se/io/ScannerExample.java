package com.jk.jdk.j2se.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) throws Exception {
		// reading a text file line by line using
		System.out.println("Reading a text file line by line: ");
		Scanner sc = new Scanner(new File(".settings\\org.eclipse.core.resources.prefs"));
		while (sc.hasNext()) {
			String str = sc.nextLine();
			System.out.println(str);
		}
		sc.close();

		// reading all words from file using Scanner
		// System.out.println("Reading a text file word by word: ");
		// Scanner sc2 = new Scanner(new File("file.txt")); while
		// (sc2.hasNext()) { String word = sc2.next();
		// System.out.println(word); } sc2.close(); }
	}

	public static void readTextFileUsingFileReader(String fileName) {
		try {
			FileReader textFileReader = new FileReader(fileName);
			char[] buffer = new char[8096];
			int numberOfCharsRead = textFileReader.read(buffer);
			while (numberOfCharsRead != -1) {
				System.out.println(String.valueOf(buffer, 0, numberOfCharsRead));
				numberOfCharsRead = textFileReader.read(buffer);
			}
			textFileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
