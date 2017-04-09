/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.core.accessspecifier.publicc;

/**
 *
 * @author Jitendra
 */

public class PublicX {
    
    private String x;

    public PublicX() {
        this.x = PublicX.class.getSimpleName();
    }
    
    public PublicX(String className) {
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