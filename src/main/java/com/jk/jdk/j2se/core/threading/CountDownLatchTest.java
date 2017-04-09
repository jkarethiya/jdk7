package com.jk.jdk.j2se.core.threading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
	public static void main(String args[]) {
		int time = 1000;
		
		final CountDownLatch latch = new CountDownLatch(3);

		Thread cacheService = new Thread(new Service("CacheService", time, latch));
		Thread alertService = new Thread(new Service("AlertService", time, latch));
		Thread validationService = new Thread(new Service("ValidationService", time, latch));

		cacheService.start(); // separate thread will initialize CacheService
		alertService.start(); // another thread for AlertService initialization
		validationService.start();

		// application should not start processing any thread until all service
		// is up and ready to do there job.
		// Countdown latch is idle choice here, main thread will start with
		// count 3 and wait until count reaches zero. each thread once up and read will
		// do a count down. this will ensure that main thread is not started
		// processing until all services is up.


		try {
			latch.await(); // main thread is waiting on CountDownLatch to finish
			System.out.println("All services are up, Application is starting now");
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

	}

	private static class Service implements Runnable {
		private final String name;
		private final int timeToStart;
		private final CountDownLatch latch;

		public Service(String name, int timeToStart, CountDownLatch latch) {
			this.name = name;
			this.timeToStart = timeToStart;
			this.latch = latch;
		}

		@Override
		public void run() {
			try {
				Thread.sleep(timeToStart);
			} catch (InterruptedException ex) {
				System.out.println(ex);
			}
			
			System.out.println(name + " is Up");
			
			latch.countDown(); // reduce count of CountDownLatch by 1
		}

	}

}
