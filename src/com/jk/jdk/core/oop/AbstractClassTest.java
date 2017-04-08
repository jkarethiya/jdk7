/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 05-May-2015 10:59:18 pm
 */
package com.jk.jdk.core.oop;

/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 05-May-2015 10:59:18 pm
 */
public abstract class AbstractClassTest {

	/**
	 * @author Jitendra Arethiya
	 * @version 1.0
	 * @since 05-May-2015 10:59:20 pm
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	protected abstract void foo();
	

}

class A1 extends AbstractClassTest {

	/* (non-Javadoc)
	 * @see com.jk.java.core.oop.AbstractClassTest#foo()
	 */
	@Override
	protected void foo() {
		// TODO Auto-generated method stub
		
	}
	
}

class F1 extends AbstractClassTest {

	/* (non-Javadoc)
	 * @see com.jk.java.core.oop.AbstractClassTest#foo()
	 */
	@Override
	public void foo() {
		// TODO Auto-generated method stub
		
	}
	
}


class B1 extends AbstractClassTest {

	/* (non-Javadoc)
	 * @see com.jk.java.core.oop.AbstractClassTest#foo()
	 */
	@Override
	protected final void foo() {
		// TODO Auto-generated method stub
		
	}
	
}


/*class C1 extends AbstractClassTest {

	 (non-Javadoc)
	 * @see com.jk.java.core.oop.AbstractClassTest#foo()
	 
	@Override
	private void foo() {
		// TODO Auto-generated method stub
		
	}
	
}

class D1 extends AbstractClassTest {

	 (non-Javadoc)
	 * @see com.jk.java.core.oop.AbstractClassTest#foo()
	 
	@Override
	void foo() {
		// TODO Auto-generated method stub
		
	}
	
}*/

