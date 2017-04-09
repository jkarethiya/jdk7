/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.core.string;

/**
 *
 * @author Jitendra
 */
public class CharArrayVsString {
    public static void main(String[] args) {
        String strPassword="Unknown";
        char[] charPassword= new char[]{'U','n','k','w','o','n'};
        System.out.println("String password: " + strPassword);
        System.out.println("Character password: " + charPassword);
    }
}
