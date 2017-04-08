/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.core.collections.map;

import java.util.HashMap;
import java.util.Map;



/**
 *
 * @author ic034480
 */
class HashKey {
    private int data;

    public HashKey(int data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        if(1 == this.data)
            return 1;
        else
            return 2;
    }

    /*
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HashKey other = (HashKey) obj;
        return true;
    }
    */
}

public class HashMapWithSameHashCode {
    public static void main(String[] args) {
        {
            Map<String, String> hashMap = new HashMap<String, String>();

            String str1 = new String("ABC");
            String str2 = new String("ABC");

            hashMap.put(str1, "A");
            hashMap.put(str2, "B");

            System.out.println("str1: " + hashMap.get(str1));
            System.out.println("str2: " + hashMap.get(str2));
        }

        {
            Map<HashKey, String> hashMap = new HashMap<HashKey, String>();

            HashKey str1 = new HashKey(1);
            HashKey str2 = new HashKey(2);

            hashMap.put(str1, "A");
            hashMap.put(str2, "B");

            System.out.println("str1: " + hashMap.get(str1));
            System.out.println("str2: " + hashMap.get(str2));
        }
    }
}
