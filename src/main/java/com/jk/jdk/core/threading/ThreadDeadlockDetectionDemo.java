/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 09-Jun-2015 8:14:32 pm
 */
package com.jk.jdk.core.threading;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 09-Jun-2015 8:14:32 pm
 */
public class ThreadDeadlockDetectionDemo {

	/**
	 * @author Jitendra Arethiya
	 * @version 1.0
	 * @since 09-Jun-2015 8:14:32 pm
	 */
	public static void main(String[] args) {
		ThreadMXBean bean = ManagementFactory.getThreadMXBean();
		  
        long ids[] = bean.findMonitorDeadlockedThreads();
 
        if(ids != null)
        {
            ThreadInfo threadInfo[] = bean.getThreadInfo(ids);
 
            for (ThreadInfo threadInfo1 : threadInfo)
            {
                System.out.println(threadInfo1.getThreadId());    //Prints the ID of deadlocked thread
 
                System.out.println(threadInfo1.getThreadName());  //Prints the name of deadlocked thread
 
                System.out.println(threadInfo1.getLockName());    //Prints the string representation of an object for which thread has entered into deadlock.
 
                System.out.println(threadInfo1.getLockOwnerId());  //Prints the ID of thread which currently owns the object lock
 
                System.out.println(threadInfo1.getLockOwnerName());  //Prints name of the thread which currently owns the object lock.
                
                System.out.println();
                System.out.println();
            }
        }
        else
        {
            System.out.println("No Deadlocked Threads");
        }
	}

}
