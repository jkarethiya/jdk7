/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.core.generic;

import java.util.*;

/**
 *
 * @author Jitendra
 */
public class GenericTest {
    public static void main(String[] args) {
        Set<String> setOfString = new HashSet<String>();
        setOfString.add("A");
        //setOfString.add(new Integer("1")); //No suitable method found for add
        
        setOfString = new LinkedHashSet<>();
        
        Set<Object> setOfObect = new HashSet<Object>();
        
        //setOfObect = new HashSet<String>(); //Incompatible types
        
        //Set<int> setOfIntPrimitiveType = new HashSet<>(); //unexpected type
    }
}
