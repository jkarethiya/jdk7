package com.jk.jdk.j2se.io;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ByteArrayToStream {
	public static void main(String args[]) {
		String str = "Google is GOD";
		byte[] bytes = str.getBytes(StandardCharsets.UTF_8);

		InputStream is = new ByteArrayInputStream(bytes);
		String stringFromBytes = streamToString(is, StandardCharsets.UTF_8);
		System.out.println("String recreated from bytes : " + str);

		OutputStream os = new ByteArrayOutputStream();
		try {
			os.write(bytes);
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String streamToString(InputStream is, Charset encoding) {
		BufferedReader br = new BufferedReader(new InputStreamReader(is, encoding));
		StringBuilder sb = new StringBuilder(1024);
		try {
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				line = br.readLine();
			}
		} catch (IOException io) {
			System.out.println("Failed to read from Stream");
			io.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException ioex) {
				System.out.println("Failed to close Streams");
				ioex.printStackTrace();
			}
		}
		return sb.toString();
	}

}
