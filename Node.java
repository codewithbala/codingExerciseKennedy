package com.kabaso.mock.week7;

import java.util.HashSet;
//Write a program to check if a linked list has a cycle. 
import java.util.Set;

class Node {
	int data;
	Node next;

	Node(int x) {
		this.data = x;
		this.next = null;
	}
}

class LinkedListCycle {

	static boolean detectLoop(Node head) {
		Set<Node> st = new HashSet<>();

		while (head != null) {
			if (st.contains(head))
				return true;

			st.add(head);

			head = head.next;
		}
		return false;
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(60);

		head.next.next.next.next = head;

		if (detectLoop(head))
			System.out.println("true");
		else
			System.out.println("false");
	}
}
