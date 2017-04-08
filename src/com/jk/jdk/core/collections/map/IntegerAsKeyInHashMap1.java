/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.core.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jitendra
 */
public class IntegerAsKeyInHashMap1 {
    public static void main(String[] args) {
        System.out.println("-----Using string literal as hashmap key-----");
        {
            Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
            Integer str1 = 1;
            Integer str2 = 1;
            
            // Using string literal as hashmap key
            hashMap.put(str1, 100);
            hashMap.put(str2, 200);          
            
            for(Integer key : hashMap.keySet()) {
                System.out.println("Key: " + key + " & Value: " + hashMap.get(key));
            }
                
        }
        
        System.out.println("-----Using string object and literal as hashmap key-----");
        {
            Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
            Integer str2 = new Integer(1000);
            Integer str1 = 1000;
            
            System.out.println("str1: " + str1.hashCode());
            System.out.println("str2: " + str2.hashCode());
            
            // Using string object as hashmap key
            hashMap.put(str1, 100);
            hashMap.put(str2, 200);            
            
            for(Integer key : hashMap.keySet()) {
                System.out.println("Key: " + key + " & Value: " + hashMap.get(key));
            }
        }        
        
        System.out.println("-----Using string object as hashmap key-----");
        {
            Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
            Integer str2 = new Integer(1000);
            Integer str1 = new Integer(1000);
            
            System.out.println("str1: " + str1.hashCode());
            System.out.println("str2: " + str2.hashCode());
            
            // Using string object as hashmap key
            hashMap.put(str1, 100);
            hashMap.put(str2, 200);            
            
            for(Integer key : hashMap.keySet()) {
                System.out.println("1: Key: " + key + " & Value: " + hashMap.get(key));
            }
            
            hashMap.put(1000, 100);            
            
            for(Integer key : hashMap.keySet()) {
                System.out.println("2: Key: " + key + " & Value: " + hashMap.get(key));
            }
            
            str2 = 10;
            hashMap.put(str2, 100);            
            
            for(Integer key : hashMap.keySet()) {
                System.out.println("3: Key: " + key + " & Value: " + hashMap.get(key));
            }
        }
    }    
}
