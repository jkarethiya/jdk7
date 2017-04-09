/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.java.testerclasses;

/**
 *
 * @author Jitendra
 */
public class SimpleClass {
    private String privateStringNonStaticVariable;
    public String publicStringNonStaticVariable;
    String defaultStringNonStaticVariable;
    protected String protectedStringNonStaticVariable;
    
    private int privateIntegerNonStaticVariable;
    public int publicIntegerNonStaticVariable;
    int defaultIntegerNonStaticVariable;
    protected int protectedIntegerNonStaticVariable;
    
    private static String privateStringStaticVariable;
    public static String publicStringStaticVariable;
    static String defaultStringStaticVariable;
    protected static String protectedStringStaticVariable;
    
    static
    {
        privateStringStaticVariable = "private String Static Variable";
        publicStringStaticVariable = "public String Static Variable";
        defaultStringStaticVariable = "default String Static Variable";
        protectedStringStaticVariable = "protected String Static Variable";
    }
    
    public SimpleClass() {
        privateStringNonStaticVariable = "private String Non-Static Variable";
        publicStringNonStaticVariable = "public String Non-Static Variable";
        defaultStringNonStaticVariable = "default String Non-Static Variable";
        protectedStringNonStaticVariable = "protected String Non-Static Variable";
        
        privateIntegerNonStaticVariable = 1;
        publicIntegerNonStaticVariable = 4;
        defaultIntegerNonStaticVariable = 2;
        protectedIntegerNonStaticVariable = 3;     
    }
    
    private int getInteger() {
        return 10;
    }
    
    private int getIntegerWithParameter(int a) {
        return 10 + a;
    }
}
