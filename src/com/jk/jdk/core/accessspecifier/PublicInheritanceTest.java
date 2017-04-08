/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jk.jdk.core.accessspecifier;

/**
 *
 * @author Jitendra
 */

class X {
    private String x;
    
    public X()  {
        x = this.getClass().getSimpleName();
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

class Y extends X {
    private String y;
    
    public Y()  {
        y = this.getClass().getSimpleName();
    }
    
    private String getPrivateY() {
        return "getPrivateY " + this.getClass().getSimpleName();
    }
    
    protected String getProtectedY() {
        return "getProtectedY " + Y.class.getSimpleName();
    }  
        
    String getDefaultY() {
        return "getDefaultY " + this.getClass().getSimpleName();
    }  
    
    public String getPublicY() {
        return "getPublicY " + this.getClass().getSimpleName();
    }
    
    protected String getProtectedX() {
        return "getProtectedX in " + this.getClass().getSimpleName();
    }
    
    private String getPrivateX() {
        return "getPrivateX " + this.getClass().getSimpleName();
    }
    
    String getDefaultX() {
        return "getDefaultX " + this.getClass().getSimpleName();
    }  
    
    public String getPublicX() {
        return "getPublicX " + this.getClass().getSimpleName();
    }
}


public class PublicInheritanceTest {

    public static void main(String[] args) {
        Y y = new Y();
        System.out.println("y.getDefaultX(): " + y.getDefaultX());
        System.out.println("y.getProtectedY(): " + y.getProtectedY());
        System.out.println("y.getDefaultX(): " + y.getDefaultX());
        System.out.println("y.getProtectedX(): " + y.getProtectedX());
        
        X x = new X();
        System.out.println("x.getDefaultX(): " + x.getDefaultX());
        
        
        
        x = y;
        
        System.out.println("x.getProtectedX(): " + x.getProtectedX());
        System.out.println("x.getDefaultX(): " + x.getDefaultX());
    }

}
