package com.jk.jdk.j2se.core.object;

public class PrimitiveArrayTest {
	public static void main(String[] args) {
		System.out.println(int[].class.isPrimitive());
		System.out.println(int[].class.getName());
		System.out.println(int[].class.getSuperclass());

		System.out.println(int.class.isPrimitive());
		System.out.println(int.class.getName());
		System.out.println(int.class.getSuperclass());

		Object ref = new float[] { 1, 2, 3 }; // valid statement?
		//Object[] ref = new int[] { 1, 2, 3 }; // valid statement?
		System.out.println(ref);
		
		//System.out.println(null);
	}
}
