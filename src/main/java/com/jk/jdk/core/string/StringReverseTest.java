package com.jk.jdk.core.string;

public class StringReverseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABCD";

		StringBuilder sbd = new StringBuilder(s);

		int length = sbd.length();

		for (int i = 0; i < length / 2; i++) {
			char current = sbd.charAt(i);
			int end = length - i - 1;

			sbd.setCharAt(i, sbd.charAt(end));
			sbd.setCharAt(end, current);
			
			
		}
		
		System.out.println(sbd);
	}

}
