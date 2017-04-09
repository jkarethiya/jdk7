/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.j2se.core.threading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StartVsRunCall{

    public static void main(String args[]) {

        System.out.println("Main Thread : " + Thread.currentThread().getName());

        //creating two threads for start and run method call
        Thread startThread = new Thread(new Task("start"));
        startThread.start(); //calling start method of Thread - will execute in new Thread

        Thread runThread = new Thread(new Task("run"));
        runThread.run();  //calling run method of Thread - will execute in current Thread

        Runnable r = new Task("Test1");
        Thread t = new Thread(r);
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(StartVsRunCall.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /*
     * Simple Runnable implementation
     */
    private static class Task implements Runnable{
        private String caller;

        public Task(String caller){
            this.caller = caller;
        }

        @Override
        public void run() {
            System.out.println("Caller: "+ caller + " and code on this Thread is executed by : " + Thread.currentThread().getName());

        }
    }
}