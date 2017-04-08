/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.j2se.core.collections.iterator;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author ic034480
 */
public class ConcurrentModificationExceptionTest {
    public static void main(String args[])
    {
        System.out.println("ListIterator: Adding data from iterator as well as from arraylist while iterating");
        {
            ArrayList arrayListData = new ArrayList ();
            arrayListData.add("Raju");
            arrayListData.add("jitendra");
            ListIterator listIterator = arrayListData.listIterator();

            try {
                while(listIterator.hasNext()) {
                    System.out.println("Data: " + listIterator.next());
                    listIterator.add("Setty");
                    arrayListData.add("Goud");
                }
            } catch(ConcurrentModificationException exc) {
                System.out.println(exc);
            }
        }

        System.out.println("ListIterator: Adding data from arraylist only while iterating");
        {
            ArrayList arrayListData = new ArrayList ();
            arrayListData.add("Raju");
            arrayListData.add("jitendra");
            ListIterator listIterator = arrayListData.listIterator();

            try {
                while(listIterator.hasNext()) {
                    System.out.println("Data: " + listIterator.next());
                    arrayListData.add("Goud");
                }
            } catch(ConcurrentModificationException exc) {
                System.out.println(exc);
            }
        }

        System.out.println("Iterator: Adding data from iterator as well as from arraylist while iterating");
        {
            ArrayList arrayListData = new ArrayList ();
            arrayListData.add("Raju");
            arrayListData.add("jitendra");
            Iterator iterator = arrayListData.iterator();

            try {
                while(iterator.hasNext()) {
                    System.out.println("Data: " + iterator.next());
                    iterator.remove();
                    arrayListData.add("Goud");
                }
            } catch(ConcurrentModificationException exc) {
                System.out.println(exc);
            }
        }

        System.out.println("Iterator: Adding data through arraylist while iterating");
        {
            ArrayList arrayListData = new ArrayList ();
            arrayListData.add("Raju");
            arrayListData.add("jitendra");
            Iterator iterator = arrayListData.iterator();

            try {
                while(iterator.hasNext()) {
                    System.out.println("Data: " + iterator.next());
                    arrayListData.add("Goud12");
                }
            } catch(ConcurrentModificationException exc) {
                System.out.println(exc);
            }
        }

        System.out.println("Iterator: Adding data through arraylist once iteraotor object is created");
        {
            ArrayList arrayListData = new ArrayList ();
            arrayListData.add("Raju");
            arrayListData.add("jitendra");
            Iterator iterator = arrayListData.iterator();
            arrayListData.add("Jyotsana");                                          //When once ListIterator object is created, operations on ArrayList object al1 cannot be done.
            try {
                while(iterator.hasNext()) {
                    System.out.println("Data: " + iterator.next());
                    arrayListData.add("Goud12");
                }
            } catch(ConcurrentModificationException exc) {
                System.out.println(exc);
            }
        }

        System.out.println("Iterator: removing data through iterator");
        {
            ArrayList arrayListData = new ArrayList ();
            arrayListData.add("Raju");
            arrayListData.add("jitendra");
            Iterator iterator = arrayListData.iterator();

            try {
                while(iterator.hasNext()) {
                    System.out.println("Data: " + iterator.next());
                    iterator.remove();
                }
            } catch(ConcurrentModificationException exc) {
                System.out.println(exc);
            }

            while(iterator.hasNext()) {
                System.out.println("Data1: " + iterator.next());
            }
        }
    }
}
