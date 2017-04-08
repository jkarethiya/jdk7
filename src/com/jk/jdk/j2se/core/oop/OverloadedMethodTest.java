package com.jk.jdk.j2se.core.oop;

public class OverloadedMethodTest {
	public void test(String str) {
		System.out.println("String");
	}

	public void test(Object obj) {
		System.out.println("Object");
	}

	public void test(int obj) {
		System.out.println("Integer");
	}
	
	public static void main(String[] args) {
		OverloadedMethodTest obj = new OverloadedMethodTest();
		obj.test(null);
	}
}