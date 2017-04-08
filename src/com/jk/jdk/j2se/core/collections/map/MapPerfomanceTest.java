/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 21-Jul-2015 3:42:49 pm
 */
package com.jk.jdk.j2se.core.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapPerfomanceTest {

	public static void main(String[] args) {
		long startTime = 0, endTime = 0;
		Map<Integer, String> map = new ConcurrentHashMap<>(10000);
		
		
		startTime = System.currentTimeMillis();
		for(int i = 1; i <= 10000; i++)
			map.put(i, "A"+i);
		endTime = System.currentTimeMillis();
		
		System.out.println("Time to insert into concurrenthashmap is " + (endTime - startTime));

		Map<Integer, String> hashMap = new HashMap<>(10000);
		
		
		startTime = System.currentTimeMillis();
		for(int i = 1; i <= 10000; i++)
			hashMap.put(i, "A"+i);
		endTime = System.currentTimeMillis();
		
		System.out.println("Time to insert into hashmap is " + (endTime - startTime));

	
		startTime = System.currentTimeMillis();
		for(int i = 1; i <= 10000; i++)
			map.get(i);
		endTime = System.currentTimeMillis();
		
		System.out.println("Time to retrieval from concurrenthashmap is " + (endTime - startTime));
		
		startTime = System.currentTimeMillis();
		for(int i = 1; i <= 10000; i++)
			hashMap.get(i);
		endTime = System.currentTimeMillis();
		
		System.out.println("Time to retrieval from hashmap is " + (endTime - startTime));
	}

}
