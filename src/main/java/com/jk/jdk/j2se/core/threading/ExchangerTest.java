package com.jk.jdk.j2se.core.threading;

import java.util.concurrent.Exchanger;

public class ExchangerTest {
	public static void main(String[] args) {
		Exchanger<String> exchanger = new Exchanger<String>();

		ExchangerRunnable<String> exchangerRunnable1 = new ExchangerRunnable<String>(exchanger, "A");

		ExchangerRunnable<String> exchangerRunnable2 = new ExchangerRunnable<String>(exchanger, "B");

		new Thread(exchangerRunnable1).start();
		new Thread(exchangerRunnable2).start();
	}
}

class ExchangerRunnable<T> implements Runnable {

	Exchanger<T> exchanger = null;
	T object = null;

	public ExchangerRunnable(Exchanger<T> exchanger, T object) {
		this.exchanger = exchanger;
		this.object = object;
	}

	public void run() {
		try {
			T previous = this.object;

			this.object = this.exchanger.exchange(this.object);

			System.out.println(Thread.currentThread().getName() + " exchanged " + previous + " for " + this.object);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}