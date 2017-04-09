/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 17-Jul-2015 9:23:14 pm
 */
package com.jk.jdk.core.threading;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
	
	private Semaphore binary = new Semaphore(1);
	private int i = 0;

	public static void main(String[] args) {
		final SemaphoreExample se = new SemaphoreExample();
		
		new Thread() {
			@Override
			public void run() {
				se.test();
			}
		}.start();
		
		new Thread("JK-2") {
			@Override
			public void run() {
				se.test();
			}
		}.start();

	}
	
	private void test(){
		try{
			binary.acquire();
			System.out.println(++i);
			
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			binary.release();
		}
	}

}
