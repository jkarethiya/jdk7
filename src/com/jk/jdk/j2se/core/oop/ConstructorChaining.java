/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.j2se.core.oop;

/**
 *
 * @author A421108
 */

class A{

A(){

System.out.println("Constructor of A running");

}

}

class B extends A{

B(){
//this();
//a call to super() is placed here
this(1);
System.out.println("Constructor of B running");

}

B(int i){

//a call to super() is placed here
System.out.println("Constructor of B running");

}

}


public class ConstructorChaining {
    public static void main(String[] args){
        new B();
    }
}