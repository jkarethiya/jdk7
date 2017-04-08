package com.jk.jdk.j2se.util;

public class BasicTimingMonitor {

	private String activityName;
	private long startTime;
	private long endTime;

	public BasicTimingMonitor(String activityName) {
		this.activityName = activityName;
	}
	
	public BasicTimingMonitor(String activityName, boolean startTimer) {
		this(activityName);
		startTime = System.nanoTime();
	}

	public void startTimer() {
		startTime = System.nanoTime();
	}

	public void endTimer() {
		this.endTimer(false);
	}

	public void endTimer(boolean displayTime) {
		endTime = System.nanoTime();
		
		if(displayTime)
			showTimeDifference();
	}
	
	public void showTimeDifference() {
		System.out.println("\n/*****************************************************************************");
		System.out.println("Time taken fot " + activityName + " - " + ((endTime - startTime) / 1000) + "ms");
		System.out.println("/*****************************************************************************");
	}

}
