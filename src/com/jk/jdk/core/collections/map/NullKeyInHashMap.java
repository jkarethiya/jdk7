/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.core.collections.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author ic034480
 */
public class NullKeyInHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>(12, 1);
        
        String s = null;
        map.put("", "A");
        System.out.println(map.get(""));
        
        map.put("1", "10");
        map.put("2", "20");        
        System.out.println(map);

        map.remove(s);
        
        System.out.println(map);
        
        Hashtable ht = new Hashtable(map);
        ht.get(s);
    }
}
