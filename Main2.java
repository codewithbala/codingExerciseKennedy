package com.kabaso.mock.week4;

import java.util.HashSet;

//Write a program to remove duplicates from an unsorted linked list.
	class Node {
	    int data;
	    MaxDepth next;
	    Node(int x) {
	        data = x;
	        next = null;
	    }
	}

	class Main2{
	    static MaxDepth removeDuplicates(MaxDepth head) {
	        HashSet<Integer> hashSet = new HashSet<>();
	        MaxDepth curr = head;
	        MaxDepth prev = null;

	        while (curr != null) {
	          
	            if (hashSet.contains(curr.data)) {
	                prev.next = curr.next;
	                curr = curr.next;
	            } else {
	              
	                 hashSet.add(curr.data);
	                prev = curr;
	                curr = curr.next;
	            }
	        }
	        return head;
	    }

	    static void printList(MaxDepth head) {
	        MaxDepth curr = head;
	        while (curr != null) {
	            System.out.print(curr.data + " ");
	            curr = curr.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        MaxDepth head = new MaxDepth(12);
	        head.next = new MaxDepth(11);
	        head.next.next = new MaxDepth(12);
	        head.next.next.next = new MaxDepth(21);
	        head.next.next.next.next = new MaxDepth(41);
	        head.next.next.next.next.next = new MaxDepth(43);
	        head.next.next.next.next.next.next = new MaxDepth(21);

	        head = removeDuplicates(head);
	        printList(head);
	    }
	}



