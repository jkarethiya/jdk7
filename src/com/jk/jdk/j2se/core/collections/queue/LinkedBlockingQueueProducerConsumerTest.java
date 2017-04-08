/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 31-Jul-2015 10:04:59 pm
 */
package com.jk.jdk.j2se.core.collections.queue;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueProducerConsumerTest {

	private static final LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(new LinkedBlockingQueueProducer(queue, 5), "producer");
		Thread t2 = new Thread(new LinkedBlockingQueueConsumer(queue), "consumer-1");
		Thread t3 = new Thread(new LinkedBlockingQueueConsumer(queue), "consumer-2");
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println(queue);
	}

}

