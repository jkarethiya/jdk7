/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 23-Jun-2015 10:41:04 am
 */
package com.jk.jdk.j2se.core.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 23-Jun-2015 10:41:04 am
 */
public class RemoveMethodDemo {

	/**
	 * @author Jitendra Arethiya
	 * @version 1.0
	 * @since 23-Jun-2015 10:41:04 am
	 */
	public static void main(String[] args) {
		List<String> animal = new ArrayList<>();
		animal.add("Horse");
		animal.add("Lion");
		animal.add("Tiger");

		Iterator<String> itr = animal.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
			
			break;
		}
		
		System.out.println();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
	}

}
