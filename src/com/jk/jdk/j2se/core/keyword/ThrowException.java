/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.j2se.core.keyword;

import java.io.IOException;

/**
 *
 * @author Jitendra
 */
public class ThrowException {
    

   public static void demoRethrow() {
   	try {
   		throw new IOException("Error");
   	}
   	catch(IOException exception) {
   		/*
   	 	 * Do some handling and then rethrow.
   	 	 */
   		throw new RuntimeException(exception);
   	}
   }
   
   public static void main( String[] args )
   {
   	try {
   		demoRethrow();
   	}
   	catch(RuntimeException exception) {
   	System.err.println(exception.getCause().getMessage());
   	}
   }
}
