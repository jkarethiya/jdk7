package com.jk.easymock;

import org.easymock.EasyMock;
import org.junit.Test;

public class EasyMockTest {

	@Test
	public void testBar() {
		Foo fooMock = EasyMock.createMock(Foo.class); 
		
		fooMock.bar(); 
		fooMock.barWithParameters(false, "Parameter 2");

	}

}
