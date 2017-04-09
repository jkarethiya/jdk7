/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jk.jdk.core.compare;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Jitendra
 */
public class ComparatorTest {

    public static void main(String[] args) {
        String[] str = {"B3", "A1","A100","Z18","Z2"};
        System.out.println(Arrays.toString(str));
        
        //Arrays.asList(str).stream().forEach(s -> System.out.print(":" + s));
        
        
        System.out.println("B3".substring(1, "B3".length()));
        
        //char ch1 = str[0].substring(0, 1).toCharArray()[0];
        //int int1 = Integer.parseInt(str[0].substring(1, str[0].length()-1));
        //System.out.println(int1);
        
        //Arrays.sort(str);
        
        //System.out.println(Arrays.toString(str));
        
        Arrays.sort(str, new StringComparator());      
        
        System.out.println(Arrays.toString(str));
    }
}

class StringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String ch1 = o1.substring(0, 1);
        String ch2 = o2.substring(0, 1);
        
        Integer int1 = Integer.valueOf(o1.substring(1, o1.length()));
        Integer int2 = Integer.valueOf(o2.substring(1, o2.length()));
        
        int temp;
        if(int1 > int2) {
            temp = int1;
            int1 = int2;
            int2 = temp;
        }
        
        if(ch1.compareTo(ch2) == 0)
            return int1.compareTo(int2);
        else if(ch1.compareTo(ch2) < 0)
            return int1.compareTo(int2);
        else 
            return int1.compareTo(int2);
    }

}
