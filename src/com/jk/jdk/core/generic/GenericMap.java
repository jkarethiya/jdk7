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
public class GenericMap {
    public static void main(String[] args) {
        Map<String, Object> mapOfString = new HashMap<String, Object>();
        
        //mapOfString = new HashMap<String, Integer>();
        
        String str = "Jitendra";
        Integer i = new Integer("1");
        
        mapOfString.put(str, i);
        
        System.out.printf("%s%n", mapOfString);
        
        
        Map<Object, String> mapOfObject = new HashMap<>();
        
        str = "Jitendra";
        Double d = new Double("1.01");
        
        mapOfObject.put(d, str);
        
        System.out.printf("%s%n", mapOfObject);        
        
        List<String> names = new ArrayList<String>();
        names.add("JitendraPatel");
        //mapOfObject.put(i, names);
    }
}
