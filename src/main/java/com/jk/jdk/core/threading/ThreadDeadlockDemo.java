/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 09-Jun-2015 8:02:50 pm
 */
package com.jk.jdk.core.threading;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 09-Jun-2015 8:02:50 pm
 */
public class ThreadDeadlockDemo {

	/**
	 * @author Jitendra Arethiya
	 * @version 1.0
	 * @since 09-Jun-2015 8:02:50 pm
	 */
	public static void main(String[] args) {

		final SharedObject o1 = new SharedObject();
		final SharedObject o2 = new SharedObject();
		
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " :- " + Thread.currentThread().getPriority());
				o1.methodOne(o2);
			}
			
		}, "Daemon Thread");
		
		//t1.setPriority(4);
		//t1.setDaemon(true);
		t1.start();
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " :- " + Thread.currentThread().getPriority());
				o2.methodOne(o1);
			}
			
		}, "Non-Daemon Thread");
		
		t2.start();
		
		try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
		

		
	}

}

class SharedObject {
	
	synchronized public void methodOne(SharedObject o1) {
	       Thread t = Thread.currentThread();
	       
	        System.out.println(t.getName()+"is executing methodOne...");
	 
	        System.out.println(t.getName()+"is calling methodTwo...");
	 
			try
	        {
	            Thread.sleep(5000);
	        }
	        catch (InterruptedException e)
	        {
	            e.printStackTrace();
	        }
	        
	        o1.methodTwo(this);
	 
	        System.out.println(t.getName()+"is finished executing methodOne...");

	}
	
	synchronized public void methodTwo(SharedObject o2) {
        Thread t = Thread.currentThread();
        
        System.out.println(t.getName()+"is executing methodTwo...");
 
        System.out.println(t.getName()+"is calling methodOne...");
 
        o2.methodOne(this);
 
		try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        
        System.out.println(t.getName()+"is finished executing methodTwo...");

	}
}
