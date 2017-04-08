/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 31-Jul-2015 10:06:20 pm
 */
package com.jk.jdk.j2se.core.collections.queue;

import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueProducer implements Runnable {
	
	private final LinkedBlockingQueue<String> queue;
	private int noOfElements;

	public LinkedBlockingQueueProducer(LinkedBlockingQueue<String> queue, int noOfElements) {
		super();
		this.queue = queue;
		this.noOfElements = noOfElements;
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		while(noOfElements > 0) {
			try {
				String data = String.valueOf(noOfElements);	
				System.out.println(Thread.currentThread().getName() + " produced " + data);
				queue.put(data);
				
				noOfElements--;
			} catch(Exception exc) {
				exc.printStackTrace();
			}
		}
		
	}
	
}