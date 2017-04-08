/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 19-Jul-2015 8:19:40 pm
 */
package com.jk.jdk.j2se.core.object;

public class PassByValueAndReferenceExample {

	public static void main(String args[]) {
		Animal a1 = new Animal("Lion");
		Animal a2 = new Animal("Crocodile");

		System.out.println("Before Swap:- a1:" + a1 + "; a2:" + a2);
		swap(a1, a2);
		System.out.println("After Swap:- a1:" + a1 + "; a2:" + a2);
		
		System.out.println("Before Modify: " + a1);
		modify(a1);
		System.out.println("After Modify: " + a1);
	}

	public static void modify(Animal animal) {
		animal.setName("Tiger");
	}

	public static void swap(Animal animal1, Animal animal2) {
		Animal temp = new Animal("");
		temp = animal1;
		animal1 = animal2;
		animal2 = temp;
	}

}

class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}	
}