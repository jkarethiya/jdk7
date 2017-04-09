package com.jk.jdk.j2se.core.exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionTest {
	public static void main(String[] args) {
		ExceptionTest et = new ExceptionTest();
		try {
			et.precise();
		} catch (ParseException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void obscure() throws Exception {
		try {
			new FileInputStream("abc.txt").read();
			new SimpleDateFormat("ddMMyyyy").parse("12-03-2014");
		} catch (ParseException ex) {
			System.out.println("Caught exception: " + ex.getMessage());
			throw ex;
		}

	}

	public void precise() throws ParseException, IOException {
		try {
			new FileInputStream("abc.txt").read();
			new SimpleDateFormat("ddMMyyyy").parse("12-03-2014");
		} catch (Exception ex) {
			System.out.println("Caught exception: " + ex.getMessage());
			throw ex;
		}

	}
}
