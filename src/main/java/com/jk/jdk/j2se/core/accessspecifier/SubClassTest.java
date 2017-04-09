/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jk.jdk.j2se.core.accessspecifier;

import com.jk.jdk.j2se.core.accessspecifier.publicc.PublicX;

/**
 *
 * @author Jitendra
 */

//class A {
//    private String a;
//    
//    public A()  {
//        a = A.class.getSimpleName();
//    }
//    
//    private String getPrivateA() {
//        return "getPrivateA " + this.getClass().getSimpleName();
//    }
//    
//    protected String getProtectedA() {
//        return "getProtectedA " + this.getClass().getSimpleName();
//    }  
//        
//    String getDefaultA() {
//        return "getDefaultA " + this.getClass().getSimpleName();
//    }  
//    
//    public String getPublicA() {
//        return "getPublicA " + this.getClass().getSimpleName();
//    }
//    
//     
//}

class B extends PublicX {
    private String b;
    
    public B()  {
        b = B.class.getSimpleName();
    }
    
    private String getPrivateB() {
        return "getPrivateB " + this.getClass().getSimpleName();
    }
    
    protected String getProtectedB() {
        return "getProtectedB " + B.class.getSimpleName();
    }  
        
    String getDefaultB() {
        return "getDefaultB " + this.getClass().getSimpleName();
    }  
    
    public String getPublicB() {
        return "getPublicB " + this.getClass().getSimpleName();
    }

    
    private String getPrivateX() {
        return "getPrivateX " + this.getClass().getSimpleName();
    }
    
    protected String getProtectedX() {
        return "getProtectedX " + this.getClass().getSimpleName();
    }

    String getDefaultX() {
        return "getDefaultX " + this.getClass().getSimpleName();
    }
    
    public String getPublicX() {
        return "getPublicX " + this.getClass().getSimpleName();
    }
}


public class SubClassTest {

    public static void main(String[] args) {
        B b = new B();
        System.out.println("b.getProtectedB(): " + b.getProtectedB());
        System.out.println("b.getDefaultB(): " + b.getDefaultB());
        System.out.println("b.getPublicB(): " + b.getPublicB());
        // System.out.println("b.getProtectedB(): " + b.getPrivateB()); // getPrivateB() has private access in Bs

        PublicX x = new PublicX();
        // System.out.println("x.getPrivateX(): " + x.getPrivateX());
        // System.out.println("x.getProtectedX(): " + x.getProtectedX()); // getDefaultX() is not public in PublicX; cannot be accessed from outside package
        // System.out.println("x.getDefaultX(): " + x.getDefaultX()); // getDefaultX() is not public in PublicX; cannot be accessed from outside package
        System.out.println("x.getPublicX(): " + x.getPublicX());
        
        x = b;
        
//        System.out.println("x.getPrivateX(): " + x.getPrivateX());
//        System.out.println("x.getProtectedX(): " + x.getProtectedX()); // getDefaultX() is not public in PublicX; cannot be accessed from outside package
//        System.out.println("x.getDefaultX(): " + x.getDefaultX()); // getDefaultX() is not public in PublicX; cannot be accessed from outside package
          //System.out.println("x.getPublicX(): " + x.getProtectedB());
          System.out.println("x.getPublicX(): " + x.getPublicX());
      
    }

}
