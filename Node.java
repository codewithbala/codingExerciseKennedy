package com.kabaso.mock.week3.task4;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

class Main {
	Node head;

	public void addToTheLast(Node node) {
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = node;
		}
	}

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String args[]) {
		Main head1 = new Main();
		Main head2 = new Main();

		head1.addToTheLast(new Node(1));
		head1.addToTheLast(new Node(2));
		head1.addToTheLast(new Node(4));
		head1.addToTheLast(new Node(6));
		head1.addToTheLast(new Node(9));

		head2.addToTheLast(new Node(3));
		head2.addToTheLast(new Node(4));
		head2.addToTheLast(new Node(7));
		head2.addToTheLast(new Node(8));

		head1.head = new Mergesortedlists().MergeSortedLists(head1.head, head2.head);
		head1.printList();

	}
}

class Mergesortedlists {
	public Node MergeSortedLists(Node head1, Node head2) {

		if (head1 == null)
			return head2;
		if (head2 == null)
			return head1;

		if (head1.data < head2.data) {
			head1.next = MergeSortedLists(head1.next, head2);
			return head1;
		} else {
			head2.next = MergeSortedLists(head1, head2.next);
			return head2;
		}

	}
}
