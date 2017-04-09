/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 09-Jun-2015 7:44:24 pm
 */
package com.jk.jdk.j2se.core.threading;

/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 09-Jun-2015 7:44:24 pm
 */
public class DaemonThreadDemo {

	/**
	 * @author Jitendra Arethiya
	 * @version 1.0
	 * @since 09-Jun-2015 7:44:25 pm
	 */
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " :- " + Thread.currentThread().getPriority());
			}
			
		}, "Daemon Thread");
		
		t1.setPriority(4);
		t1.setDaemon(true);
		t1.start();
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " :- " + Thread.currentThread().getPriority());
			}
			
		}, "Non-Daemon Thread");
		
		t2.start();
	}

}
