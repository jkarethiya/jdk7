/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.core.generic;

import java.util.*;

/**
 *
 * @author Jitendra
 */
public class GenericMethod {
    
    /*
    private static Number List extractElements(List bag, Class Number){
        List result = new ArrayList();
        
        return result;
    }
    */
    
    private static <T> List<T> extractElements(List bag, Class<T> type) {
        List<T> result = new ArrayList<T>();
        
        for(Object e : bag) {
            //if(e instanceof T) {} //can't use instanceof
            
            if(type.isAssignableFrom(e.getClass())) {
                result.add((T) e);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List listOfBag = new ArrayList();
        listOfBag.add(new Integer(0));
        listOfBag.add(new Integer(1));
        listOfBag.add(new Double(2008.5));
        listOfBag.add("a string");
        listOfBag.add(new StringBuffer("I am Jitendra"));
        
        System.out.printf("All elements in bag: %s%n", listOfBag);
        
        List<Number> numbersInBag = extractElements(listOfBag, Number.class);
        System.out.printf("Number elements in bag: %s%n", numbersInBag);
        
        List<Integer> integersInBag = extractElements(listOfBag, Integer.class);
        System.out.printf("Integer elements in bag: %s%n", integersInBag);
        
        List<StringBuffer> stringBufferInBag = extractElements(listOfBag, StringBuffer.class);
        System.out.printf("String elements in bag: %s%n", stringBufferInBag);
    }
    
}
