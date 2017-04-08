/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.j2se.core.string;

/**
 *
 * @author Jitendra
 */
public class StringClass {
    public static void main(String[] args) {
        String str = "Jitendra Patel";
        
        String str1 = "Jitendra";
        String str2 = "Jyotsana";
        
        // Length
        System.out.println("Length of the string: " + str.length());                // returns the length of the String
        System.out.println("isEmpty: " + str.isEmpty());                            // same as thisString.length == 0
 
// Comparison
        System.out.println("str1.equals(str2)" + str1.equals(str2));                // CANNOT use '==' or '!=' to compare two Strings in Java
        System.out.println("str1.equals(str2)" + str1.equalsIgnoreCase(str2));
        System.out.println("compareTo: " + str1.compareTo(str2));                   // return 0 if this string is the same as another; <0 if lexicographically less than another; or >0
        /*
        int compareToIgnoreCase(String another)
        boolean startsWith(String another)
        boolean startsWith(String another, int fromIndex)  // search begins at fromIndex
        boolean endsWith(String another)

        // Searching & Indexing
        int indexOf(String search)
        int indexOf(String search, int fromIndex)
        int indexOf(int character)
        int indexOf(int character, int fromIndex)      // search forward starting at fromIndex
        int lastIndexOf(String search)
        int lastIndexOf(String search, int fromIndex)  // search backward starting at fromIndex
        int lastIndexOf(int character)
        int lastIndexOf(int character, int fromIndex)

        // Extracting a char or part of the String (substring)
        char charAt(int index)              // index from 0 to String's length - 1
        String substring(int fromIndex)
        String substring(int fromIndex, int endIndex)  // exclude endIndex

        // Creating a new String or char[] from the original (Strings are immutable!)
        String toLowerCase()
        String toUpperCase()
        String trim()          // create a new String removing white spaces from front and back
        String replace(char oldChar, char newChar)  // create a new String with oldChar replaced by newChar
        String concat(String another)               // same as thisString + another
        char[] toCharArray()                        // create a char[] from this string
        void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)  // copy into dst char[]

        // Static methods for converting primitives to String
        static String ValueOf(type arg)  // type can be primitives or char[]

        // Static method resulted in a formatted String using format specifiers
        static String format(String formattingString, Object... args)   // same as printf()

        // Regular Expression (JDK 1.4)
        boolean matches(String regexe)
        String replaceAll(String regexe, String replacement)
        String replaceAll(String regexe, String replacement)
        String[] split(String regexe)             // Split the String using regexe as delimiter,
                                                  // return a String array
        String[] split(String regexe, int count)  // for count times only
        */
        
        char ch = str.charAt(1);
        System.out.println("ch: " + Character.charCount(0x251));
    }
}
