/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.core.collections.map.custommap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ic034480
 */
public class CustomHashMapTest {
    public static void main(String[] args) {
        CustomHashMap map1 = new CustomHashMap(2);
        map1.add("A", "AB");
        
        Set<Object> s = map1.keySet();
        //Iterator<Object> itr = s.iterator();
        //while(itr.hasNext()) {
            System.out.println(map1.get("A"));
        //}
    }
}
