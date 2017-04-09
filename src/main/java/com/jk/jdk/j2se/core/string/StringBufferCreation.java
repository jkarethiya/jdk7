/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.j2se.core.string;

/**
 *
 * @author Jitendra
 */
public class StringBufferCreation {
    public static void main(String[] args){
        //Test the String Concatenation using + operator
        long startTime = System.currentTimeMillis();
        StringBuffer result = new StringBuffer("hello");
        for(int i=0;i<500000;i++){
            result.append("hello");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for String concatenation using StringBuffer with out setting size : " + (endTime - startTime)+ " milli seconds");

        //Test the String Concatenation using StringBuffer
        long startTime1 = System.currentTimeMillis();
        StringBuffer result1 = new StringBuffer(300000);
        //result1.ensureCapacity(300000);
        for(int i=0;i<500000;i++){
            result1.append("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken for String concatenation using StringBuffer with setting size :  " + (endTime1 - startTime1)+ " milli seconds");
    }    
}
