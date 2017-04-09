/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.j2se.core.collections.iterator;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/**
 *
 * @author ic034480
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        System.out.println("ListIterator: Adding data from arraylist only while iterating");
        {
            ArrayList arrayListData = new ArrayList ();
            arrayListData.add("Raju");
            arrayListData.add("jitendra");

            ListIterator listIterator = arrayListData.listIterator();

            while(listIterator.hasNext()) {
                System.out.println("Data1: " + listIterator.next());
                listIterator.add("Jyotsana");
            }

            System.out.println("Adding data from arraylist only while iterating");
            while(listIterator.hasNext()) {
                System.out.println("Data2: " + listIterator.next());
            }

            /*
            System.out.println("getting fresh iteraotr object");
            listIterator = arrayListData.listIterator();

            while(listIterator.hasNext()) {
                System.out.println("Data3: " + listIterator.next());

            }
            */
        }

        {
            ArrayList arrayListData = new ArrayList ();
            arrayListData.add("Raju");
            arrayListData.add("jitendra");

            for(Object a : arrayListData) {
                ArrayList a1 = (ArrayList) a;
                System.out.println("Data4: " + a1.get(0));
            }
        }
    }
}
