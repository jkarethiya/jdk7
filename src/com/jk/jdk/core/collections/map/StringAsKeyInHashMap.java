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
public class StringAsKeyInHashMap {
    public static void main(String[] args) {
        System.out.println("-----Using string literal as hashmap key-----");
        {
            Map<String, String> hashMap = new HashMap<>();
            String str1 = "A";
            String str2 = "A";
            
            // Using string literal as hashmap key
            hashMap.put(str1, "Jitendra");
            hashMap.put(str2, "Jyotsana");          
            
            for(String key : hashMap.keySet()) {
                System.out.println("Key: " + key + " & Value: " + hashMap.get(key));
            }
        }
        
        System.out.println("-----Using string object and literal as hashmap key-----");
        {
            Map<String, String> hashMap = new HashMap<String, String>();
            String str2 = new String("ABC");
            String str1 = "ABC";
            
            System.out.println("str1: " + str1.hashCode());
            System.out.println("str2: " + str2.hashCode());
            
            // Using string object as hashmap key
            hashMap.put(str1, "Jitendra");
            hashMap.put(str2, "Jyotsana");            
            
            for(String key : hashMap.keySet()) {
                System.out.println("Key: " + key + " & Value: " + hashMap.get(key));
            }
        }        
        
        System.out.println("-----Using string object as hashmap key-----");
        {
            Map<String, String> hashMap = new HashMap<String, String>();
            String str2 = new String("ABC");
            String str1 = new String("ABC");
            
            System.out.println("str1: " + str1.hashCode());
            System.out.println("str2: " + str2.hashCode());
            
            // Using string object as hashmap key
            hashMap.put(str1, "Jitendra");
            hashMap.put(str2, "Jyotsana");            
            
            for(String key : hashMap.keySet()) {
                System.out.println("1: Key: " + key + " & Value: " + hashMap.get(key));
            }
            
            hashMap.put("ABC", "Jitendra");            
            
            for(String key : hashMap.keySet()) {
                System.out.println("2: Key: " + key + " & Value: " + hashMap.get(key));
            }
            
            str2 = "AB";
            hashMap.put(str2, "Jitendra");            
            
            for(String key : hashMap.keySet()) {
                System.out.println("3: Key: " + key + " & Value: " + hashMap.get(key));
            }
        }
    }    
}
