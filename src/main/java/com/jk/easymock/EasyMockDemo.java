package com.jk.easymock;

public class EasyMockDemo {

	public static void main(String[] args) {
		Foo foo = new Foo();
		
		foo.bar(); 
		String string = "Parameter 2"; 
		foo.barWithParameters(false, string);
	}

}

