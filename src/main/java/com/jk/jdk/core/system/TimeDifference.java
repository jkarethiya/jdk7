/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.core.system;
/**
 *
 * @author Jitendra
 */
public class TimeDifference {
    public static void main(String[] args) {
        {
            long beginTime = System.nanoTime();
            for(long l = 0; l < 999999999; l++);
            long endTime = System.nanoTime(); 
            System.out.println("Using nanoTime: " + (endTime - beginTime));
        }

        {
            long beginTime = System.currentTimeMillis();
            for(long l = 0; l < 999999999; l++);
            long endTime = System.currentTimeMillis(); 
            System.out.println("Using currentTimeMillis: " + (endTime - beginTime)*1000);
        }       
    } 
}
