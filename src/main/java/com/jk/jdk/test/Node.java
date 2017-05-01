package com.jk.jdk.test;
public class Node<T> {
   public int data;
   public Node<T> left;
   public Node<T> right;

   public Node(int data) {
      this.data = data;
      left = null;
      right = null;
   }

   public Node() {
      left = null;
      right = null;
   }

   int getData() {
      return data;
   }
}