package com.jk.jdk.j2se.core.interfaces;

public class InterfaceTest implements A, B {

	public static void main(String[] args) {
		InterfaceTest i = new InterfaceTest();
		InterfaceTest a = i.new A1();
		a.show();
				
	}

	@Override
	public void show() {
		System.out.println(this.getClass().getName());
	}
	
	class A1 extends InterfaceTest {
		@Override
		public void show() {
			System.out.println(this.getClass().getName());
		}
	}

}

interface A {
	int a = 5;
	
	public void show();
}

interface B {
	int a = 4;
	public void show();
}