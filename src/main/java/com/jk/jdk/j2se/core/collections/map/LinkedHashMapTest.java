package com.jk.jdk.j2se.core.collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import com.jk.jdk.core.bean.Bike;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		Map<Integer, String> cache = new HashMap<>(); 
		
		cache.put(1, "Stuart"); 
		cache.put(2, "Steven"); 
		cache.put(3, "James"); 
		cache.put(4, "Ian"); 
		
		//System.out.printf("Name of Employee with id %d is %s %n", 1, cache.get(1)); 
		//System.out.println("Order of Entries in HashMap - Not guaranteed"); 
		System.out.println(cache); 
		
		//Using TreeMap to create a sorted cache, sorting keys on reverse order 
		SortedMap<Integer, String> sortedCache = new TreeMap<>(Collections.reverseOrder()); 
		sortedCache.putAll(cache); 
		
		//System.out.println("Order of Entries in TreeMap - Sorted in reverse order"); 
		System.out.println(sortedCache); 
		
		//Using LinkedHashMap to create copy of a Map in Java 
		Map<Integer, String> copy = new LinkedHashMap<>(5, 0.9f, true); 
		//System.out.println("Order of Entries in a copy Map created by LinkedHashMap"); 
		copy.put(4, "Steven"); 
		copy.put(1, "James");
		copy.put(3, "James33333333333333");
		copy.put(5, "James444444444");
		
		//Set<Map.Entry<Integer, String>> set = copy.entrySet();
		
		/*
		for(Map.Entry<Integer, String> entry : cache.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		*/
		for (Map.Entry<Integer, String> entry : copy.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}

		Map<Bike, Object> bikes = new LinkedHashMap<Bike, Object>();

		Bike cbr250r = new Bike("Honda", 250);
		Bike cbr1000rr = new Bike("Honda", 1000);
		Bike ninja250r = new Bike("Kawasaki", 250);
		Bike ninja1000rr = new Bike("Kawasaki", 1000);

		bikes.put(cbr250r, null);
		bikes.put(cbr1000rr, null);
		bikes.put(ninja250r, null);
		bikes.put(ninja1000rr, null);
		
		System.out.println(bikes);
	}
	
}
