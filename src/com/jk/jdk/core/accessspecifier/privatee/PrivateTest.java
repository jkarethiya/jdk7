/*
 * To change this template, choose Tools | Templates and open the template in the editor.
 * @author Jitendra
 */

package com.jk.jdk.core.accessspecifier.privatee;

class A {
    private int a;
    private static int z = 11;

    public A() {
        this.a = 10;
    }

    private int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    private static int getZ() {
        return z;
    }

    /*
    private String getA(int a, Object obj, String[] args) {
        return "Private Method with Parameters";
    }

    private String getX(int a) {
        return "non-static Private Method with Parameters";
    }
    */

}

class B extends A {
    private int b;

    public B() {
        this.b = 20;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}


public class PrivateTest {

    public static void main(String[] args) {
        B b = new B();
        //System.out.println("a: " + b.getA());
        System.out.println("b: " + b.getB());
    }

}
