package com.jk.jdk.j2se.core.collections.list;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicArrowButton;

import com.jk.jdk.j2se.util.BasicTimingMonitor;

public class ArrayListRemoveTest {

	public static void main(String[] args) {
		List<Integer> clearList = new ArrayList<Integer>();
		List<Integer> removeList = new ArrayList<Integer>();

		for (int i = 1; i <= 100000; i++) {
			clearList.add(i);
		}

		removeList.addAll(clearList);

		BasicTimingMonitor monitor1 = new BasicTimingMonitor("ArrayListRemoveTest");
		monitor1.startTimer();
		clearList.clear();
		monitor1.endTimer(true);
		
		BasicTimingMonitor monitor2 = new BasicTimingMonitor("ArrayListClearTest");
		monitor2.startTimer();
		removeList.removeAll(removeList);
		monitor2.endTimer(true);
	}

}
