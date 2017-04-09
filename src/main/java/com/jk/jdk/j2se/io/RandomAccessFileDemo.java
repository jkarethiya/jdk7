package com.jk.jdk.j2se.io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	public static void main(String args[]) {
		String data = "KitKat (4.4 - 4.4.2)";
		writeToRandomAccessFile("RandomAccessFileDemo", 100, data);
		System.out.println("String written into RandomAccessFile from Java Program : " + data);
		String fromFile = readFromRandomAccessFile("sample.store", 100);
		System.out.println("String read from RandomAccessFile in Java : " + fromFile);
	}

	public static String readFromRandomAccessFile(String file, int position) {
		String record = null;
		try {
			RandomAccessFile fileStore = new RandomAccessFile(file, "rw");
			fileStore.seek(position);
			record = fileStore.readUTF();
			fileStore.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return record;

	}

	public static void writeToRandomAccessFile(String file, int position, String record) {
		try {
			RandomAccessFile fileStore = new RandomAccessFile(file, "rw");

			fileStore.seek(position);
			fileStore.writeUTF(record);
			fileStore.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
