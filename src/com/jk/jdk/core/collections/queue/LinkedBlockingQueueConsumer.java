/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 31-Jul-2015 10:15:17 pm
 */
package com.jk.jdk.core.collections.queue;

import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueConsumer  implements Runnable {
	
	private final LinkedBlockingQueue<String> queue;

	public LinkedBlockingQueueConsumer(LinkedBlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		while(true) {
			try {
				
				String data = queue.take().toString();
				System.out.println(Thread.currentThread().getName() + " consumed " + data);
			} catch(Exception exc) {
				exc.printStackTrace();
			}
		}
		
	}
}