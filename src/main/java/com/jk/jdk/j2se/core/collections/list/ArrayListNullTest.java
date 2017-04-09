package com.jk.jdk.j2se.core.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListNullTest {

	public static void main(String[] args) {
		Integer i = null;
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(i);
		
		System.out.println(list);
		
		//int[] i1 = {i};
		
		
		
		int[] ii = {i};
		System.out.println(Arrays.toString(ii));
	}
	
}
