/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.j2se.core.generic;

import java.util.*;
/**
 *
 * @author Jitendra
 */
public class GenericList {
        public static void main(String[] args) {
            List<String> names = new ArrayList<String>();
            names.add("JitendraPatel");
            
            System.out.printf("List<String> names: %s%n", names);
            
            List<List<String>> listOfList = new ArrayList<List<String>>();
            List<String> subList = new ArrayList<>();
            subList.add("Arethiya");
            listOfList.add(subList);
            
            List<String> subList1 = new ArrayList<>();
            subList1.add("Jitendra");
            listOfList.add(subList1);               
            
            List<String> subList2 = new ArrayList<>();
            subList2.add("Jyotsna");
            listOfList.add(subList2);    
            
            /*
            subList2 = new ArrayList<>();
            subList2.add("Patel");
            listOfList.add(subList2);                
            */
            
            System.out.printf("List<String> names: %s%n", listOfList);
            
            
            List<Number> listOfNumbers = new ArrayList<Number>();
            Double d = new Double("1.01");
            Integer i = new Integer("1");
            
            listOfNumbers.add(i);
            listOfNumbers.add(d);
            
            System.out.printf("List<String> listOfNumbers:");
            for(Number number :  listOfNumbers){
                System.out.printf("%s   ", number);
            }
            
            System.out.printf("%nlistOfNumbers.get(0): %s%n", listOfNumbers.get(0));
        }
}
