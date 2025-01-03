package com.kabaso.mock.week12.task1;

class ListNode {
	// Write a program to merge two sorted linked lists into a single sorted linked
	// list.
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class MergeSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		ListNode dummy = new ListNode(0);
		ListNode curr = dummy;

		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				curr.next = l1;
				l1 = l1.next;
			} else {
				curr.next = l2;
				l2 = l2.next;
			}
			curr = curr.next;
		}
		if (l1 != null)
			curr.next = l1;
		if (l2 != null)
			curr.next = l2;

		return dummy.next;
	}
}