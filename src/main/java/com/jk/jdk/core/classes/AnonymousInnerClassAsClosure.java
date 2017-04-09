/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 19-Jul-2015 7:33:20 pm
 */
package com.jk.jdk.core.classes;

import java.util.Arrays;
import java.util.Comparator;

public class AnonymousInnerClassAsClosure {

	 public static void main(String[] args) {
	        // this is a value used (bound) by the inner class
	        // note that it needs to be "final"
	        final int numberToCompareTo=10;

	        // this is an inner class that acts like a closure and uses one bound value
	        Comparator<Integer> comp=new Comparator<Integer>() {
	            public int compare(Integer a, Integer b) {
	            	return a.compareTo(b) == 0 ? 0 : (a.compareTo(b) < 0 ? -1 : 1);
	            	
	                //int result=0;
	                //if (a<numberToCompareTo) result=result-1;
	               // if (b<numberToCompareTo) result=result+1;
	                //return result;
	            }
	        };

	        Integer[] array=new Integer[] {1,10, 5 , 15, 6 , 20, 21, 3, 7};

	        // this is a function call that takes the inner class "closure" as a parameter
	        Arrays.sort(array,comp);

	        for (int i:array) 
	        	System.out.println(i);
	    }

}
