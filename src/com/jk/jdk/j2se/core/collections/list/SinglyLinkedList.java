package com.jk.jdk.j2se.core.collections.list;

public class SinglyLinkedList {
	private Node head; // Head is the first node in linked list

	public void append(String data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		tail().next = new Node(data);
	}

	private Node tail() {
		Node tail = head;
		// Find last element of linked list known as tail
		while (tail.next != null) {
			tail = tail.next;
		}
		return tail;
	}

	private static class Node {
		private Node next;
		private String data;

		public Node(String data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return data.toString();
		}
	}

	/*
	 * * Reverse a singly linked list using recursion. In recursion Stack is *
	 * used to store data. * 1. Traverse linked list till we find the tail, *
	 * that would be new head for reversed linked list.
	 */

	private Node reverseRecursively(Node node) {
		Node newHead = null;
		if ((node.next == null)) {
			return node;
		}
		
		System.out.println("node for-"+ node);
		
		newHead = reverseRecursively(node.next);
		
		System.out.println("newHead-"+ newHead);
		
		// reverse the link e.g. C->D->null will be null
		System.out.println("node.next.next-"+ node.next.next);
		System.out.println("node...-"+ node);
		node.next.next = node;
		System.out.println("node.next-"+ node.next);
		node.next = null;
		
		System.out.println("newHeaddd return-"+ newHead);
		return newHead;
	}

	public void reverseRecursively() {
		head = reverseRecursively(head);
	}

	/**
	 * * Reverse linked list using 3 pointers approach in O(n) time * It
	 * basically creates a new list by reversing direction, and * subsequently
	 * insert the element at the start of the list.
	 */
	public void reverseIteratively() {
		Node current = head;
		Node previous = null;
		Node forward = null;

		// traversing linked list until there is no more element

		while (current.next != null) {
			// Saving reference of next node, since we are changing current node
			forward = current.next;
			System.out.println("forward-"+ forward);
			// Inserting node at start of new list
			current.next = previous;
			System.out.println("current.next-"+ current.next);
			
			previous = current;
			System.out.println("previous-"+ previous);

			// Advancing to next node
			current = forward;
			System.out.println("current-"+ current);
			System.out.println("------------------------------------");
		}

		head = current;
		System.out.println("head-"+ head);
		head.next = previous;
		System.out.println("head.next-"+ head.next);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node current = head;
		while (current != null) {
			sb.append(current).append("-->");
			current = current.next;
		}
		if (sb.length() >= 3) {
			sb.delete(sb.length() - 3, sb.length());
			// to remove --> from last node
		}
		return sb.toString();
	}
	
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
		linkedlist.append("C");
		//linkedlist.append("D");
		//linkedlist.append("E");
		//linkedlist.append("F");
		return linkedlist;
	}
}
