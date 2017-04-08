/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.core.string;

/**
 *
 * @author Jitendra
 */
public class StringComparison {
    public static void main(String[] args) {
/*        
        String str1 = "a" + "bc";
        String str2 = "ab" + "c";        
        
        System.out.println("str1 == str2: " + str1 == str2);
*/
        System.out.println("---------------------------------------------------"); 
        System.out.println("Creating String object by assigning string literals");
        System.out.println("---------------------------------------------------");
        {
            String s1 = "abc";
            String s2 = "abc";

            System.out.println("s1 = " + s1);
            System.out.println("s2 = " + s2);
            System.out.println("s1 == s2? " + (s1 == s2));
            System.out.println("s1.equals(s2)? " + (s1.equals(s2)));

            s2 += "abc";

            System.out.println("s1 = " + s1);
            System.out.println("s2 = " + s2);
            System.out.println("s1 == s2? " + (s1 == s2));
            System.out.println("s1.equals(s2)? " + (s1.equals(s2)));
        }
        
        System.out.println("---------------------------------------------------"); 
        System.out.println("Creating String object by assigning string literals in a different way");
        System.out.println("---------------------------------------------------"); 
        {
            String s1 = "ab" + "c";
            String s2 = "a" + "bc";

            System.out.println("s1 = " + s1);
            System.out.println("s2 = " + s2);
            System.out.println("s1 == s2? " + (s1 == s2));
            System.out.println("s1.equals(s2)? " + (s1.equals(s2)));
        }
        
        System.out.println("---------------------------------------------------"); 
        System.out.println("Creating String object by assigning string literals & using constructors");
        System.out.println("---------------------------------------------------"); 
        {
            String s1 = "ab" + "c";
            
            //if for any reason you want the variables to not occupy the same location in memory, there are two ways to do this. First, 
            //you can use the String constructor, since those are not put into the pool
            String s2 = new String("abc");

            System.out.println("s1: " + s1.hashCode()); 
            System.out.println("s2: " + s2.hashCode());
            
            System.out.println("s1 = " + s1);
            System.out.println("s2 = " + s2);
            System.out.println("s1 == s2? " + (s1 == s2));
            System.out.println("s1.equals(s2)? " + (s1.equals(s2)));
        } 
        
        System.out.println("---------------------------------------------------"); 
        System.out.println("Creating String object by assigning string literals and adding another string literals into it");
        System.out.println("---------------------------------------------------"); 
        {
            String s1 = "ab";
            String s2 = "a";
            
            //forcing it to occupy a diffent address for each addition
            s1 += "c";
            s2 += "bc";

            System.out.println("s1 = " + s1);
            System.out.println("s2 = " + s2);
            System.out.println("s1 == s2? " + (s1 == s2));
            System.out.println("s1.equals(s2)? " + (s1.equals(s2)));
        }
        
        System.out.println("---------------------------------------------------"); 
        System.out.println("Creating String object by assigning string literals & using constructors and applying intern method");
        System.out.println("---------------------------------------------------"); 
        {
            String s1 = "abc";
            String s2 = new String("abc");
            
            //intern() method --> it looks at its value, and if it matches a value ALREADY IN the String pool ONLY, it returns a reference to the object in the pool, 
            //else it adds itself to the pool
            s2 = s2.intern();

            System.out.println("s1 = " + s1);
            System.out.println("s2 = " + s2);
            System.out.println("s1 == s2? " + (s1 == s2));
            System.out.println("s1.equals(s2)? " + (s1.equals(s2)));
        }
        
        System.out.println("---------------------------------------------------"); 
        System.out.println("Creating String object using new operator");
        System.out.println("---------------------------------------------------"); 
        {
            String s1 = new String("abc");
            String s2 = new String("abc");
            
            System.out.println("S1's hashcode: " + s1.hashCode());
            System.out.println("S2's hashcode: " + s2.hashCode());            
            
            System.out.println("s1 == s2?: " + (s1 == s2));
        }        
        
        System.out.println("---------------------------------------------------"); 
        System.out.println("Creating String object by assigning string literals & using constructors and applying intern method");
        System.out.println("---------------------------------------------------"); 
        {
            String s1 = new String("abc");
            String s2 = new String("abc");
            s2 = s2.intern();

            System.out.println("s1 = " + s1);
            System.out.println("s2 = " + s2);
            System.out.println("s1 == s2? with s2 intern only: " + (s1 == s2));
            
            //The intern() method is called, but neither s1 nor s2 is in the pool so all the intern() method does is add it to the pool. To make THESE ==, 
            // you must call intern() twice so that there is already a reference in the pool (from the first call)
            
            s1 = s1.intern();
            System.out.println("s1 == s2? intern called on s1 as well as on s2: " + (s1 == s2));
            
            System.out.println("s1.equals(s2)? " + (s1.equals(s2)));
            
            System.out.println("s1.substring(0): " + s1.substring(0));
        }
    }
}

/*
* An important concept about Java that you may not know is that symbols (variable names) aren't actually the object that they are defined as. 
* They actually hold a reference to the spot in memory where the actual object is kept. Since Strings are SO commonly used, 
* 
* Strings literals that are the same are given the same address so that it saves memory and doesn't have to make another. 
* Think about it as if there can only be one of each String in there and anything matching is assigned a reference to that String. 
* However, once all references are gone, then the object is erased. However, once they change, the addresses are different
*/