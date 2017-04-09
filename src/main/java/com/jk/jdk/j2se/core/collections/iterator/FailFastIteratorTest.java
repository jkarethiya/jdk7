package com.jk.jdk.j2se.core.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIteratorTest {
	
		public static void main(String[] args) {

			List<Integer> integers = new ArrayList<Integer>();
			integers.add(0);
			integers.add(1);
			integers.add(2);
			integers.add(3);
			integers.add(4);

			Iterator iterator = integers.iterator();
			while (iterator.hasNext()) {
				System.out.println("Taking next element now");
				Integer current = (Integer) iterator.next();
				System.out.println("Performing iteration for element  = " + current );
				if (current.equals(2)) {
					//integers.remove(integers.remove(2));
					iterator.remove();
				}
			}

			System.out.println(integers);

		}
}
