/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.j2se.core.collections.map;

import java.util.Hashtable;
import java.util.Iterator;

/**
 *
 * @author ic034480
 */
public class HashTableClass {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put("A", "1");
        /*
        for(Object key : ht.keySet()) {
            System.out.println(key + ":" + ht.get(key));
        }
        */
        ht.put("A", "2");

        for(Object key : ht.keySet()) {
            System.out.println(key + ":" + ht.get(key));
        }

        //ht.put("A", null);

        for(Object key : ht.keySet()) {
            System.out.println(key + ":" + ht.get(key));
        }
    }
}
