package com.jk.jdk.j2se.core.oop;

public class OverloadedMethodInInheritanceTest {
	public void test(B obj) {
		System.out.println("B");
	}

	public void test(C obj) {
		System.out.println("C");
	}

	public void test(A obj) {
		System.out.println("A");
	}
	
	public static void main(String[] args) {
		OverloadedMethodInInheritanceTest obj = new OverloadedMethodInInheritanceTest();
		obj.test(null);
	}
	
	class A {
	}

	class B extends A {
	}

	class C extends B {
	}

}

