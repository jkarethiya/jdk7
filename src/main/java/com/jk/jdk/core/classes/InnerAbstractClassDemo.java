/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 23-Jun-2015 1:22:18 pm
 */
package com.jk.jdk.core.classes;

public class InnerAbstractClassDemo {

	public static void main(String[] args) {
		OuterClass.Test t = new OuterClass().new Test();
		
		t.show();
		
		A.B c = new A.B();
		c.show();
		
		A.B c1 = new A().new C();
		c1.show();
	}

}


class OuterClass {
	
	private double value;
	
	private abstract class InnerAbstractClass {
		public abstract void show();
	}
	
	class Test extends InnerAbstractClass {
		public void show() {
			System.out.println("Show");
		}
	}
	
	static abstract class InnerAbstractClass1 {
		public abstract void show();
	}
}


class BaseClass extends OuterClass.InnerAbstractClass1 {

	@Override
	public void show() {
		System.out.println("Show");
	}
	
	
}


class A {

	static class B {
		public void show() {
			System.out.println("B.Show");
		}
	}
	
	class C extends B {
		public void show() {
			System.out.println("C.Show");
		}
	}
	
}