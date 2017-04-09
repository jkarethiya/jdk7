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
public class CallToPrivateConstructor {
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
        Constructor[] constructors = SimpleConstructor.class.getDeclaredConstructors();
        
        for(Method method : SimpleConstructor.class.getDeclaredMethods()) {
            System.out.println("getDeclaredMethods: " + method.getName());
        }
        
        for(Method method : SimpleConstructor.class.getMethods()) {
            System.out.println("getMethods: " + method.getName());
        }
        
        for(Constructor constructor : constructors) {
            constructor.setAccessible(true);
            
            if(Modifier.isPrivate(constructor.getModifiers())) {
                System.out.println("private constructor: " + constructor.getName());
                constructor.newInstance( (Object) new String[]{"A"});
                
                constructor.newInstance( (Object[]) new String[] {"A"});
            } else {
                System.out.println("public constructor: " + constructor.getName());
                constructor.newInstance();
            }
    }
    }
}

class SimpleConstructor {
    public SimpleConstructor() {
        System.out.println("Public SimpleClass Constructor without parameter");
    }
    
    private SimpleConstructor(Object str) {
        System.out.println("Private SimpleClass Constructor with parameter " + str);
    }
    
    public void setA(){}
}