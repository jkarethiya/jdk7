/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 23-Jun-2015 2:24:29 pm
 */
package com.jk.jdk.j2se.core.classes;

public class OuterClassDemo {

	public static void main(String[] args) {
		
		OuterClassDemo o = new OuterClassDemo();

		OuterClassDemo.InnerClass inClass = o.new InnerClass() {
			// some code goes here...
			public void eat() {
				System.out.println("Anonymous Inner class eating...");
			}
		};

		inClass.eat();
	}

	public void eat() {
		System.out.println("Outer Class eating...");
	}

	class InnerClass extends OuterClass {

		public void eat() {
			System.out.println("Inner class eating...");
		}
	}
}
