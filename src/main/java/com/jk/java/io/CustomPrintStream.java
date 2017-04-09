/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 12-Jul-2015 3:23:53 pm
 */
package com.jk.java.io;

import java.io.*;

import javax.management.RuntimeErrorException;

public class CustomPrintStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutputStream output = new FileOutputStream("c:\\temp\\system.out.txt");
		
		PrintStream printOut = new PrintStream(output);

		System.setOut(printOut);

		try{
			throw new RuntimeErrorException(null);
		} catch(Exception exc) {
			StackTraceElement[] st = exc.getStackTrace();
			for(StackTraceElement s : st) {
				System.out.println(s.getClassName() + " - " + s.getMethodName() + " - " + s.getLineNumber());
			}
		
		} finally {
			System.out.flush();
			printOut.close();
			output.close();
		}
		
		System.out.println("A");
		
	}

}
