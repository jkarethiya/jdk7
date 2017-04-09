package com.jk.jdk.j2se.io;

import java.io.File;

public class SetWritableTest {

	public static void main(String[] args) throws SecurityException {

		File file = new File(".project");

		// set write permission on file only for owner
		if (file.exists()) {
			boolean bval = file.setWritable(true);
			System.out.println("set the owner's write permission: " + bval);
		} else {
			System.out.println("File cannot exists: ");
		}

		// Set write permission on File for all.
		if (file.exists()) {
			boolean bval = file.setWritable(true, false);
			System.out.println("set the every user write permission: " + bval);
		} else {
			System.out.println("File cannot exists: ");
		}

	}
	
	static class SetReadableTest{

		    public static void main(String[] args)throws SecurityException {

		     File file = new File("C:/setReadableTest.txt");
		     if (file.exists()) {

		         boolean bval = file.setReadable(true);
		         System.out.println("set the Owner Read permission: "+ bval);
		     } else {
		         System.out.println("File cannot exists: ");
		     }

		    if (file.exists()) {
		         boolean bval = file.setReadable(true,false);
		         System.out.println("set the every user Read permission: "+ bval);
		     } else {
		         System.out.println("File cannot exists: ");
		     }
		 }
		 }

		    static class SetExecuteTest{

		        public static void main(String[] args)throws SecurityException {

		         File file = new File("C:/setExecuteTest.txt");

		         if (file.exists()) {
		             boolean bval = file.setExecutable(true);
		             System.out.println("set the owner's execute permission: "+ bval);
		         } else {
		             System.out.println("File cannot exists: ");
		         }

		        if (file.exists()) {
		             boolean bval = file.setExecutable(true,false);
		             System.out.println("set the everybody execute permission: "+ bval);
		         } else {
		             System.out.println("File cannot exists: ");
		         }
		     }
		    }
}



 