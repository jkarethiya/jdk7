/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.j2se.core;

/**
 *
 * @author ic034480
 */
interface Act {
    void act();
}

class Actor1 implements Act {
    @Override
  public void act() {
    System.out.println("Actor1");
  }
}

class Actor2 extends Actor1 implements Act {
    @Override
  public void act() {
    System.out.println("Actor2");
  }
}

public class MultipleInterfaceTest {
    public static void main(String args[]) {

    }
}
