/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.core.accessspecifier.defaultt;

/**
 *
 * @author Jitendra
 */
public class DefaultX {
    
    private String x;

    public DefaultX(String className) {
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

class DefaultY {
    
    private String y;

    public DefaultY() {
        this.y = DefaultY.class.getSimpleName();
    }    
    
    private String getPrivateY() {
        return y;
    }
    
    protected String getProtectedY() {
        return y;
    }

    String getDefaultY() {
        return y;
    }
    
    public String getPublicY() {
        return y;
    }
    
}
