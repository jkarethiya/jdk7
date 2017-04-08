/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.core.accessspecifier.protectedd;

/**
 *
 * @author Jitendra
 */

public class ProtectedX {
    
    private String x;

    public ProtectedX(String className) {
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
