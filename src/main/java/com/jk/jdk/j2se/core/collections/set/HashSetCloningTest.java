package com.jk.jdk.j2se.core.collections.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetCloningTest {

	public static void main(String args[]) {

		// deep cloning Collection in Java
		Collection<Employee> org = new HashSet<>();

		org.add(new Employee("Joe", "Manager"));
		org.add(new Employee("Tim", "Developer"));
		org.add(new Employee("Frank", "Developer"));

		// creating copy of Collection using copy constructor
		Collection<Employee> copy = new HashSet<>(org.size());
		Iterator<Employee> iterator = org.iterator();
		while (iterator.hasNext()) {
			copy.add(iterator.next().clone());
		}

		System.out.println("Original Collection " + org);
		System.out.println("Copy of Collection " + copy);

		Iterator<Employee> itr = org.iterator();
		while (itr.hasNext()) {
			itr.next().setDesignation("staff");
		}

		System.out.println();

		System.out.println("Original Collection after modification " + org);
		System.out.println("Copy of Collection without modification " + copy);
		// deep Cloning List in Java
	}

	private static class Employee implements Cloneable {
		private String name;
		private String designation;

		public Employee(String name, String designation) {
			this.name = name;
			this.designation = designation;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return String.format("%s: %s", name, designation);
		}

		@Override
		protected Employee clone() {
			Employee clone = null;

			try {
				clone = (Employee) super.clone();
			} catch (CloneNotSupportedException cloneNotSupportedException) {
				throw new RuntimeException(cloneNotSupportedException);
			}

			return clone;
		}
	}

}
