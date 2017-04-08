/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 28-Jun-2015 7:47:52 pm
 */
package com.jk.jdk.core.generic;

import java.util.*;

public class ListWithManyArgDemo {

	public static void main(String[] args) {
		List<Integer> ints = toList(1, 2, 3);
		//ints.forEach(p -> System.out.println(p));
		
		List<String> words = ListWithManyArgDemo.addIntoList("hello", "world");
		//words.forEach(p -> System.out.println(p));
		
		//List<String> words = <Object>toList("one", 2, 3.0);
	}

	public static <T> List<T> toList(T... arr) {
	    List<T> list = new ArrayList<T>();
	    for (T t : arr) list.add(t);
	    return list;
	}
	
	public static <T> List<T> addIntoList(T... arg) {
		List<T> list = new ArrayList<>();
		
		for(T t : arg)
			list.add(t);
		
		return list;
	}
	
}
