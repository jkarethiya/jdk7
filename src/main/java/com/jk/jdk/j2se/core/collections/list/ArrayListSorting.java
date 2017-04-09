/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.j2se.core.collections.list;

import java.util.*;

/**
 *
 * @author Jitendra
 */
public class ArrayListSorting {
    
  //  private static final Logger logger = LoggerFactory.getLogger(ArrayListSorting.class);
    
    public static void main(String args[]) {
        // Creating and initializing Collection to sort in reverse order
        // Integer will be sorted in reverse numeric order
        List<Integer> collection = new ArrayList<Integer>();
        collection.add(101);
        collection.add(201);
        collection.add(105);
        collection.add(302);

        System.out.printf("Current order in Collection : %s%n", collection);

        // Sorting Collection in reverse order
        Collections.sort(collection, Collections.reverseOrder());

        System.out.printf("Sorted on Reverse order in Collection : {%s%n}", collection);

        // Sorting List of String in reverse Order
        List<String> alphabets = Arrays.asList("A", "B", "C", "D");
        //alphabets.add("AA");
        
        
        
        System.out.printf("Current order in List of String : {%s%n}", alphabets);

        // Sorting List in reverse Order
        Collections.sort(alphabets, Collections.reverseOrder());

        System.out.printf("List of String sorted in reverse order {%s%n}", alphabets);
        
        Collections.sort(alphabets, Collections.reverseOrder());
    }

}
