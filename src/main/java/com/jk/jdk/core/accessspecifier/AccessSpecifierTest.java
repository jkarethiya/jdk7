/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.core.accessspecifier;

import com.jk.jdk.core.accessspecifier.protectedd.ProtectedX;

/**
 *
 * @author Jitendra
 */
public class AccessSpecifierTest {
    
    public static void main(String[] args) {
        ProtectedX x = new ProtectedX(ProtectedX.class.getName());   
        
        // System.out.println("x.getPrivateX(): " + x.getPrivateX()); // error: getPrivateX() has private access in X
        // System.out.println("x.getProtectedX(): " + x.getProtectedX()); // error: getProtectedX() has protected access in X
        // System.out.println("x.getDefaultX(): " + x.getDefaultX()); //  error: getDefaultX() is not public in X; cannot be accessed from outside package
        System.out.println("x.getPublicX(): " + x.getPublicX()); // x.getPublicX(): com.jkpatel.j2se.core.accessspecifier.protectedd.X
    }
    
}

/*
        x = new X(X.class.getCanonicalName());
        System.out.println("X.class.getCanonicalName(): " + x.getX()); // X.class.getCanonicalName(): com.jkpatel.j2se.core.accessspecifier.protectedd.X

        x = new X(byte.class.getCanonicalName());
        System.out.println("byte.class.getCanonicalName(): " + x.getX()); // byte.class.getCanonicalName(): byte

        x = new X(byte.class.getName());
        System.out.println("byte.class.getCanonicalName(): " + x.getX()); // byte.class.getCanonicalName(): byte

        x = new X(X.class.getDeclaredClasses().toString());
        System.out.println("X.class.getDeclaredClasses().toString(): " + x.getX()); // byte.class.getCanonicalName(): byte
        
*/