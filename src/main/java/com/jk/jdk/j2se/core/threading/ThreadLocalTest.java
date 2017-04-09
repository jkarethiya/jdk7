package com.jk.jdk.j2se.core.threading;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import com.jk.jdk.j2se.core.bean.Employee;

public class ThreadLocalTest {

	public static void main(String[] args) throws InterruptedException {
		Thread cacheService = new Thread(new DemoTask());
		Thread alertService = new Thread(new DemoTask());
		Thread validationService = new Thread(new DemoTask());

		cacheService.start(); // separate thread will initialize CacheService
		alertService.start(); // another thread for AlertService initialization
		// validationService.start();

		cacheService.join();
		alertService.join();
		validationService.join();
	}

}

class DemoTask implements Runnable {
	// Atomic integer containing the next thread ID to be assigned
	private static final AtomicInteger nextId = new AtomicInteger(0);

	// Thread local variable containing each thread's ID
	private static final ThreadLocal<Integer> threadId = new ThreadLocal<Integer>() {
		@Override
		protected Integer initialValue() {
			return nextId.getAndIncrement();
		}
	};

	private static final ThreadLocal<Employee> employee = new ThreadLocal<Employee>() {
		@Override
		protected Employee initialValue() {
			return new Employee(1, "Jitendra");
		}
	};

	// Returns the current thread's starting timestamp
	private static final ThreadLocal<Date> startDate = new ThreadLocal<Date>() {
		protected Date initialValue() {
			return new Date();
		}
	};

	@Override
	public void run() {
		System.out.printf("Starting Thread for employee: %s : %s : %s\n", employee.get().getName(), threadId.get(), startDate.get());

		if (threadId.get() == 0) {
			employee.get().setName("Jitendraa");
			;
		}

		try {
			TimeUnit.SECONDS.sleep((int) Math.rint(Math.random() * 10));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Thread Finished for employee: %s : %s : %s\n", employee.get().getName(), threadId.get(), startDate.get());
		
		employee.remove();
	}
}