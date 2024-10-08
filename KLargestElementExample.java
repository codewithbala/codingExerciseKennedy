package com.kabaso.mock.week3.task2;

import java.util.Arrays;

public class KLargestElementExample {
	// Write a program to find the kth largest element in an array.
	private static void kthLargestByAscendingOrder(int[] arr, int k) {

		Arrays.sort(arr);
		int n = arr.length;

		System.out.println("kth Largest element " + arr[n - k]);
	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 6, 4, 5, 3 };

		kthLargestByAscendingOrder(arr, 3);
	}
}
