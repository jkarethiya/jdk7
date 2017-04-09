package com.jk.jdk.j2se.core.collections.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapIterationTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new ConcurrentHashMap<String, Integer>(); 
		
		map.put("Kindle", 99); 
		map.put("Samsung tablet", 200); 
		map.put("iPad", 1000); 
		map.put("iPad Mini", 600); 
		
		// printing all keys of ConcurrentHashMap 
		System.out.println("All keys of ConcurrentHashMap");

		for(String key : map.keySet()) {
			System.out.println("["+key+","+map.get(key)+"]");
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()){
			System.out.println("["+entry.getKey()+" , "+entry.getValue()+"]");
		}
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> itr = entrySet.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();	
			System.out.println("["+entry.getKey()+" , "+entry.getValue()+"]");
		}
	}
	
}
