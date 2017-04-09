/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.j2se.core.accessspecifier.privatee;

/**
 *
 * @author Jitendra
 */
public class PrivateX {
    
    private String x;

    public PrivateX(String className) {
        this.x = className;
    }    
    
    private String getPrivateX() {
        return x;
    }
    
    protected String getProtectedX() {
        return x;
    }

    String getDefaultX() {
        return x;
    }
    
    public String getPublicX() {
        return x;
    }
    
}

