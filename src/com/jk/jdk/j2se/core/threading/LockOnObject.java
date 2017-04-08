/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 19-Jul-2015 7:56:30 pm
 */
package com.jk.jdk.j2se.core.threading;

public class LockOnObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ABC abc = new ABC();
		
		Thread t1 = new Thread(abc, "JK-1");
		t1.start();
		
		Thread t2 = new Thread(abc, "JK-2");
		t2.start();
		
		abc.show();
	}

}


class ABC implements Runnable {
	
	public static synchronized void show() {
		System.out.println("show Enter:- " + Thread.currentThread().getName());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("show Exit:- " + Thread.currentThread().getName());
	}
	
	public synchronized void objectLock() {
		System.out.println("objectLock Enter:- " + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("objectLock Exit:- " + Thread.currentThread().getName());
	}
	
	public void display(){
		System.out.println("display Enter:- " + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("display exit" + Thread.currentThread().getName());
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {

		if("JK-1".equalsIgnoreCase(Thread.currentThread().getName()))
			display();

		if("JK-2".equalsIgnoreCase(Thread.currentThread().getName()))
			objectLock();

	}
	
	
}