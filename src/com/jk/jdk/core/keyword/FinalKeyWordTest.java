/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.core.keyword;

/**
 *
 * @author Jitendra
 */
public class FinalKeyWordTest {
    
    final private String x;
    
    FinalKeyWordTest() {
        x = FinalKeyWordTest.class.getSimpleName();
        // y = FinalKeyWordTest.class.getSimpleName(); // cannot assign a value to final variable y
    }
    
    final static private String y;
    
    static {
        y = FinalKeyWordTest.class.getSimpleName();
        // x = "2"; // non-static variable x cannot be referenced from a static context
    }
    
}
