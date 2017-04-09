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

	@Test
	public void testBarWithReturnValues() {
		Foo fooMock = EasyMock.createMock(Foo.class);

		// EasyMock.expect(fooMock.barWithReturnValues(false,
		// "A")).andReturn("barWithReturnValues");

		EasyMock.expect(fooMock.barWithReturnValuesWithFoo(false, "A")).andReturn(new Foo());

	}

	@Test
	public void testBarWithExceptions() throws Exception {
		Foo fooMock = EasyMock.createMock(Foo.class); 
		
		EasyMock.expect(fooMock.barWithExceptions("C:\\tmp\\somefile.txt")).andThrow(new Exception());;

		EasyMock.replay();
		//EasyMock.verify(fooMock);
	}

}
