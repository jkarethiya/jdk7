/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.j2se.core.accessspecifier.privatee;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 *
 * @author Jitendra
 */

public class CallToPrivateMethod {
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class c = SimpleClass.class;
        
        Method[] methods = c.getDeclaredMethods();
        
        String methodName = "";
        Object returnValue = null;
        
        for(Method method : methods) {
            method.setAccessible(true);
            methodName = method.getName();
            
            
            if(Modifier.isPrivate(method.getModifiers())){
                if(Modifier.isStatic(method.getModifiers())) {
                    System.out.println("static methodName: " + methodName);
                    
                    returnValue = method.invoke(SimpleClass.class, 10, "A", new Double[] {1.0, 2.0});
                    System.out.println("returnValue: " + returnValue);
                } else {
                    System.out.println("non-static methodName: " + methodName);
                    
                    returnValue = method.invoke(new SimpleClass(), new Object[] {});
                    System.out.println("returnValue: " + returnValue);
                }
            }    
        }
    }
}


class SimpleClass {
    
    private int getInteger() {
        return 10;
    }
    
    private static String getIntegerWithParameter(int a, String obj, Double[] args) {
        return a + obj.toString() + args[0].toString() + args[1].toString();
    }
}
