/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 19-Jul-2015 7:01:04 pm
 */
package com.jk.jdk.j2se.core.threading;

import java.util.concurrent.Semaphore;

public class SimpleSemaphoreExample {

	public static void main(String[] args) throws InterruptedException {
		Semaphore mutex = new Semaphore(2);
		
		Thread[] threads = new Thread[5];
		
		for(int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new MyThread(mutex), "JK-"+i);
			threads[i].start();
		}
		
		for(int i = 0; i < threads.length; i++) {
			threads[i].join();
		}
		
	}

}


class MyThread implements Runnable {

	private Semaphore mutex;
	
	
	public MyThread(Semaphore mutex) {
		super();
		this.mutex = mutex;
	}


	@Override
	public void run() {
		try{
			mutex.acquire();
			
			System.out.println("lock acquired by "+ Thread.currentThread().getName());
			System.out.println("Hello " + Thread.currentThread().getName() + " Thread");
			Thread.sleep(2000);
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		} finally{
			mutex.release();
			System.out.println("lock released by " + Thread.currentThread().getName());
		}
		
	}
	
}