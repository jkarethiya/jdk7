/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jk.jdk.j2se.core.keyword;

/**
 *
 * @author Jitendra
 */
public class SwtichPerfomanceTest {

    public static void main(String[] args) {
        int month = 0;
        String monthName = "";
        
        switch(2) {
            case 1:
                monthName = "JAN";
            case 2:
                monthName = "FEB";
            default:
                monthName = "";
        }
        
        System.out.println("monthName: " + monthName);
    }

}
