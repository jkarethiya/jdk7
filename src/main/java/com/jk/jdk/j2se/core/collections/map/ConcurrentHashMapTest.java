/**
 * 
 */
package com.jk.jdk.j2se.core.collections.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Jitendra
 *
 */
public class ConcurrentHashMapTest {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new ConcurrentHashMap<String, Integer>(128, 0.8f, 32); 
		
		for(int i = 0; i < 5000; i++) {
			map.put("A"+i, i);
		}
		
		System.out.println(map);
	}

}
