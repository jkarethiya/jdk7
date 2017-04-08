package com.jk.jdk.j2se.core.collections.map;

import java.util.IdentityHashMap;
import java.util.Map;

import com.jk.jdk.core.bean.Bike;

public class IdentityHashMapTest {
	public static void main(String[] args) {
		IdentityHashMap<String, String> identityMap = new IdentityHashMap<String, String>();

		identityMap.put("sony", "bravia");
		identityMap.put(new String("sony"), "mobile");

		// size of identityMap should be 2 here because two strings are
		// different objects
		System.out.println("Size of IdentityHashMap: " + identityMap.size());
		System.out.println("IdentityHashMap: " + identityMap);

		identityMap.put("sony", "videogame");

		// size of identityMap still should be 2 because "sony" and "sony" is
		// same object
		System.out.println("Size of IdentityHashMap: " + identityMap.size());
		System.out.println("IdentityHashMap: " + identityMap);
		
		//////////////////////////////////
		
		Bike cbr1 = new Bike("honda", 250);
		Bike cbr2 = cbr1;
		Bike ninja = new Bike("kawasaki", 650);
 
		Map<Bike, Object> map = new IdentityHashMap<Bike, Object>();
		map.put(cbr1, null);
		map.put(cbr2, null);
		map.put(ninja, null);
 
		System.out.println(map.size());
	}
}
