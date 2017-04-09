/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.j2se.core.collections.map.custommap;

import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.Set;

/**
 *
 * @author ic034480
 */
public class CustomHashMap extends AbstractMap<Object, Object> {
    private int bucketSize = 10;
    Object[] bucket;

    public CustomHashMap() {
        bucket = new Object[bucketSize];
    }
    
    public CustomHashMap(int bucketSize) {
        this.bucketSize = bucketSize;
        bucket = new Object[bucketSize];
    }

    /**
      * Add key, value pair in the HashMap
      * @param key
      * @param value
    */
    public void add(Object key, Object value){
          int kCode = key.hashCode();
          int index = kCode % bucketSize;
          System.out.println("->"+ index);

          if(bucket[index] == null){
                System.out.println("First entry in Bucket: Key="+ key);
                HashNode node = new HashNode();
                node.key = key;
                node.value = value;
                bucket[index] = node;
          }
          else{
                // value already exists, so add this element into LinkedList
                HashNode node = (HashNode)bucket[index];
                System.out.println("Add into List of: "+ node.key +" Key="+ key);
                // initiate the list
                node.initList();
                HashNode newNode = new HashNode();
                newNode.key = key;
                newNode.value = value;
                // add the new element into list
                node.list.addLast(newNode);
          }
    }

    /**
      * If the key is not present, it will return null
      * @param key
      * @return
      */
    public Object get(Object key){

          int index = key.hashCode() % bucketSize;
          System.out.println("Searching for Bucket Index: "+ index);
          if(index >= bucket.length)
                new ArrayIndexOutOfBoundsException("Invalid Attempt: Index="+ index);

          HashNode node = (HashNode)bucket[index];

          if(node == null){
                // At this position, there is no node in the bucket
                return null;
          }

          if(node.key.hashCode() == key.hashCode()){
                // element is found in the bucket
                System.out.println("1st Level Match....");
                return node.value;
          }

          // unable to find in the element in the bucket
          // find in the associated list
          LinkedList list = node.list;

          if(list == null){
                System.out.println("No associated list");
                return null;
          }

          // pointer to the root node of the linkedlist
          HashNode first = (HashNode) list.getFirst();

          while(true){
                if(first == null)
                      break;
                HashNode hn = (HashNode)first.key;
                if(key.hashCode() == hn.key.hashCode()){
                      System.out.println("2nd Level Match Found...");
                      return hn.value;
                }
                first = (HashNode)first.value;
          }

          // still unable to find the element
          System.out.println("Failed to hit bulls eye!! No match found");
          return null;
    }

    @Override
    public Set entrySet() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
