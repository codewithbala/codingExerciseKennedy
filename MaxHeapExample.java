package com.kabaso.mock.week10.task3;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

//Write a program to implement a max-heap. 
class MaxHeapExample {

		public static void main(String args[])
	{
	PriorityQueue<Integer> pQueue
			= new PriorityQueue<Integer>(
				Collections.reverseOrder());
pQueue.add(10);
		pQueue.add(30);
		pQueue.add(20);
		pQueue.add(400);

			System.out.println("Head value using peek function:"
						+ pQueue.peek());

		System.out.println("The queue elements:");
		Iterator itr = pQueue.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		pQueue.poll();
		System.out.println("After removing an element "
						+ "with poll function:");
		Iterator<Integer> itr2 = pQueue.iterator();
		while (itr2.hasNext())
			System.out.println(itr2.next());

		pQueue.remove(30);
		System.out.println("after removing 30 with"
						+ " remove function:");

		Iterator<Integer> itr3 = pQueue.iterator();
		while (itr3.hasNext())
			System.out.println(itr3.next());

		boolean b = pQueue.contains(20);
		System.out.println("Priority queue contains 20 "
						+ "or not?: " + b);

		Object[] arr = pQueue.toArray();
		System.out.println("Value in array: ");

		for (int i = 0; i < arr.length; i++)
			System.out.println("Value: "
							+ arr[i].toString());
	}
}
