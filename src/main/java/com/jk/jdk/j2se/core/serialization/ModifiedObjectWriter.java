package com.jk.jdk.j2se.core.serialization;

import java.io.*;
import java.util.Arrays;

public class ModifiedObjectWriter {
	public static void main(String[] args) throws IOException {
		byte[] data = new byte[10 * 1024 * 1024];
		ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("smalldata.bin")));
		for (int i = -128; i < 128; i++) {
			Arrays.fill(data, (byte) i);
			out.writeObject(data);
		}
		out.writeObject(null);
		out.close();
	}
}