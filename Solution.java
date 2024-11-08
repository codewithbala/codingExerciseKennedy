package com.kabaso.mock.week9;

class Solution {
	// Write a program to merge two sorted linked lists.
	Node sortedMerge(Node listA, Node listB) {
		Node resultLL = null;
		if (listA == null)
			return listB;
		if (listB == null)
			return listA;

		for (int i = 1; i > 0;) {
			if (listA.data < listB.data) {
				resultLL.next = listA;
				listA = listA.next;
			} else {
				resultLL.next = listB;
				listB = listB.next;
			}
			if (listA == null) {
				resultLL.next = listB;
				break;
			}
			if (listB == null) {
				resultLL.next = listA;
				break;
			}
		} 
	}
}