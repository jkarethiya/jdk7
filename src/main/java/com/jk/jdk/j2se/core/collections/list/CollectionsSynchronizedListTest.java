package com.jk.jdk.j2se.core.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSynchronizedListTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}

		List<Integer> threadSafeList = Collections.synchronizedList(list);
		threadSafeList.remove(0);
		
		System.out.println(list);
		System.out.println(threadSafeList);
		
	}
	
}
