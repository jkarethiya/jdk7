package com.jk.easymock;

import java.io.File;

public class Foo {

	public void bar() {
		System.out.println("bar");
	}

	public void barWithParameters(boolean flag, String str) {
		System.out.println("barWithParameters");
	}

	public String barWithReturnValues(boolean flag, String str) {
		return "barWithReturnValues";
	}

	public Foo barWithReturnValuesWithFoo(boolean flag, String str) {
		Foo f = new Foo();
		String str1 = f.barWithReturnValues(flag, str);
		return new Foo();
	}

	public Foo barWithExceptions(String fileName) throws Exception {
		try {

			File f = new File(fileName);
			
			if(true)
				throw new Exception();

			this.bar();
		} catch (Exception ioe) {
			throw ioe;
		}
		
		return new Foo();
	}

}