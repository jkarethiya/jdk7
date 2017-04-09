package com.jk.jdk.j2se.io;

import java.io.File;

public class FilePathTest {
	public static void main(String args[]) {
		System.out.println("Path of the given file :");
		File child = new File(".settings");
		displayPath(child);
		File parent = child.getParentFile();
		System.out.println("Path of the parent file :");
		displayPath(parent);
	}

	public static void displayPath(File testFile) {
		System.out.println("path : " + testFile.getPath());
		System.out.println("absolute path : " + testFile.getAbsolutePath());
		try {
			System.out.println("canonical path : " + testFile.getCanonicalPath());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
