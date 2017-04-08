/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.core.object;

import com.jk.jdk.core.string.StringClass;

/**
 *
 * @author Jitendra
 */
public class ObjectHashCode {
    public static void main(String[] args) {
        StringClass s1 = new StringClass();
        StringClass s2 = new StringClass();
        
        String str = new String("ABC");
        
        System.out.println("s1's hashcode: " + s1.hashCode());
        System.out.println("s2's hashcode: " + s2.hashCode());        
        System.out.println("tr's hashcode: " + str.hashCode());        
    }
}
