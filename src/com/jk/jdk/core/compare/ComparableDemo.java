/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.core.compare;

import java.util.Arrays;


/**
 *
 * @author Jitendra
 */
class Person implements Comparable<Person> {

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    private String name;
    private int id;
    
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public int compareTo(Person o) {
        return this.id - o.id;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        Person[] person = new Person[]{new Person(1, "Jamna"), new Person(1, "Jeeya"), new Person(2, "Jitendra"), new Person(4, "Jyotsana")};
        
        System.out.println("------Before Sorting------");
        for(Person p : person) {
            System.out.println(p.getId() + ":" + p.getName());
        }        
        
        Arrays.sort(person); 
        
        System.out.println("------After Sorting------");        
        for(Person p : person) {
            System.out.println(p.getId() + ":" + p.getName());
        }
    }
}