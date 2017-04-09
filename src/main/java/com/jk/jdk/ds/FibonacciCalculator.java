package com.jk.jdk.ds;

import java.util.HashMap;
import java.util.Map;

import com.jk.jdk.j2se.util.BasicTimingMonitor;

public class FibonacciCalculator {
	private static final Map<Integer, Integer> cache = new HashMap<>();

	public static void main(String[] args) {
		int number = 1000;

		System.out.println("Fibonacci series upto " + number + " numbers : ");
		// printing Fibonacci series upto number
		BasicTimingMonitor monitor = new BasicTimingMonitor("Fibonacci", true);

		for (int i = 1; i <= number; i++) {
			//System.out.print(fibonacci(i) + " ");
		}

		monitor.endTimer(true);

		System.out.println();

		System.out.println("fibonacci2 series upto " + number + " numbers : ");
		BasicTimingMonitor monitor2 = new BasicTimingMonitor("fibonacci2", true);
		for (int i = 1; i <= number; i++) {
			System.out.print(fibonacci2(i) + " ");
		}
		monitor2.endTimer(true);
		
		System.out.println();

		System.out.println("improvedFibo series upto " + number + " numbers : ");
		BasicTimingMonitor monitor3 = new BasicTimingMonitor("improvedFibo", true);
		for (int i = 1; i <= number; i++) {
			System.out.print(improvedFibo(i) + " ");
		}
		monitor3.endTimer(true);

	}

	public static int fibonacci(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}

		return fibonacci(number - 1) + fibonacci(number - 2);
		// tail recursion
	}

	public static int fibonacci2(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}

		int fibo1 = 1, fibo2 = 1, fibonacci = 1;
		for (int i = 3; i <= number; i++) {
			// Fibonacci number is sum of previous two Fibonacci number
			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;
		}

		return fibonacci; // Fibonacci number }
	}

	public static int improvedFibo(int number) {
		Integer fibonacci = cache.get(number);
		if (fibonacci != null) {
			return fibonacci; // fibonacci number from cache
		}
		// fibonacci number not in cache, calculating it

		fibonacci = fibonacci2(number);

		// putting fibonacci number in cache for future request
		cache.put(number, fibonacci);

		return fibonacci;
	}
}
