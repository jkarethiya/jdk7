/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.core.accessspecifier.protectedd;

class A {
    
    private int a;

    public A() {
        this.a = 10;
    }    
    
    protected int getA() {
        return a;
    }

    protected void setA(int a) {
        this.a = a;
    }
    
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

class C extends B {
    
    private int c;

    public C() {
        this.c = 30;
    }
    
    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
}

class D extends C {
    private int d;

    public D() {
        this.d = 40;
    }
    
    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}

class E {

    private int e;

    public E() {
        A a = new A();
        this.e = a.getA();
    }
    
    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }
    
}

public class ProtectedTest {
    
    public static void main(String[] args)
    {
        D d = new D();
        System.out.println("a: " + d.getA());
        System.out.println("b: " + d.getB());
        System.out.println("C: " + d.getC());
        System.out.println("D: " + d.getD());
        
        E e = new E();
        System.out.println("e: " + e.getE());
    }
    
}
