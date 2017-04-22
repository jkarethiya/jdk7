package com.jk.jdk.core.threading;

public class DeadlockFixed {
	/*
	 * This method request two locks, first String and then Integer 
	 */
	public void method1() {
		synchronized (String.class) {
			System.out.println("Aquired lock on String.class object");
			synchronized (Integer.class) {
				System.out.println("Aquired lock on Integer.class object");
			}
		}
	}

	/*
	 * * This method also requests same two lock but in exactly * Opposite order
	 * i.e. first String and then Integer.
	 */
	public void method2() {
		synchronized (String.class) {
			System.out.println("Aquired lock on String.class object");
			synchronized (Integer.class) {
				System.out.println("Aquired lock on Integer.class object");
			}
		}
	}

}
