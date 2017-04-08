package com.jk.jdk.j2se.core.collections.list;

public class SinglyLinkedListTest {
	public static void main(String args[]) {
		SinglyLinkedList linkedlist = getDefaultList();
		System.out.println("linked list before reversing : " + linkedlist);
		linkedlist.reverseRecursively();
		System.out.println("linked list after reversing : " + linkedlist);
		//linkedlist.reverseRecursively();
		//System.out.println("linked list after reversing recursively: " + linkedlist);
	}

	private static SinglyLinkedList getDefaultList() {
		SinglyLinkedList linkedlist = new SinglyLinkedList();
		linkedlist.append("A");
		linkedlist.append("B");
		//linkedlist.append("C");
		//linkedlist.append("D");
		//linkedlist.append("E");
		//linkedlist.append("F");
		return linkedlist;
	}

}
