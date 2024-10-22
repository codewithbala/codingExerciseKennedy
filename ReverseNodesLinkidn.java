package com.kabaso.mock.week5;

//Write a program to reverse the nodes in groups of k in a linked list.
class Node {
	int data;
	Node next;

	Node(int new_data) {
		data = new_data;
		next = null;
	}
}

public class ReverseNodesLinkidn {
	static Node reverseList(Node head) {

		if (head == null || head.next == null)
			return head;

		Node rest = reverseList(head.next);
		head.next.next = head;

		head.next = null;
		return rest;
	}

	static void printList(Node node) {
		while (node != null) {
			System.out.print(" " + node.data);
			node = node.next;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		System.out.print("Given Linked List:");
		printList(head);

		head = reverseList(head);

		System.out.print("\nReversed Linked List:");
		printList(head);
	}
}
