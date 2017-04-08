/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.j2se.core;

/**
 *
 * @author ic034480
 */

class BlankFinalVariableTest {
    private final int i;

    BlankFinalVariableTest() {
        this(5);
    }

    BlankFinalVariableTest(int i) {
        this.i = i;
    }

    /*
    BlankFinalVariableTest(double i) {

    }
    */

    public void setI(int i) {
        //this.i = i;
    }

    public int getI() {
        return this.i;
    }

}

public class BlankFinalVariable {
    public static void main(String[] args) {
        BlankFinalVariableTest test = new BlankFinalVariableTest();
        System.out.println("I: " + test.getI());
    }
}
