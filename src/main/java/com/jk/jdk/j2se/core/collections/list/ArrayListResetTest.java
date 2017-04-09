package com.jk.jdk.j2se.core.collections.list;

import java.util.ArrayList;

public class ArrayListResetTest {
	private static final int SIZE = 100_000;

	public static void main(String args[]) { 
		// Two ArrayList for clear and removeAll 
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(SIZE);
		ArrayList<Integer> integers = new ArrayList<Integer>(SIZE); 
		
		// Initialize ArrayList with 10M integers 
		for (int i = 0; i < SIZE; i++) { 
			numbers.add(new Integer(i)); 
			integers.add(new Integer(i)); 
		} 
		
		// Empty ArrayList using clear method 
		
		long startTime = System.nanoTime(); 
		numbers.clear(); 
		long elapsed = System.nanoTime() - startTime; 
		System.out.println("Time taken by clear to empty ArrayList of 1M elements (ns): " + elapsed); 
		
		// Reset ArrayList using removeAll method 
		startTime = System.nanoTime(); 
		integers.removeAll(integers); 
		long time = System.nanoTime() - startTime; 
		System.out.println("Time taken by removeAll to reset ArrayList of 1M elements (ns): " + time);
	}
}
