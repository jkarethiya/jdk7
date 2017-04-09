package com.jk.jdk.j2se.core.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * * Java program to perform binary search in Java collection e.g List, Set * @author
 * Javin Paul
 */

public class BinarySearchTest {
	public static void main(String args[]) {

		// creating List
		List<Integer> numbers = new ArrayList<Integer>(1000000);

		// List of 1M records //initializing List
		for (int i = 0; i < numbers.size(); i++) {
			numbers.add(new Integer(i));
		}

		// performing contains search
		long startTime = System.nanoTime();
		boolean isExist = numbers.contains(new Integer(1000000));
		long totalTime = System.nanoTime() - startTime;
		System.out.printf("Time to search 1Mth Record using contains() is %d nano seconds", totalTime);

		// performing binary search
		startTime = System.nanoTime();
		//Collections.sort(numbers);
		// List needs to be sorted for Binary Search
		Integer number = Collections.binarySearch(numbers, new Integer(1000000));
		totalTime = System.nanoTime() - startTime;
		System.out.printf("\nTime to search 1Mth Record using binary search is %d nano seconds", totalTime);
	}
}
