package com.kabaso.mock.week3.task2;

public class LongestIncreaseSequence {
	// Write a program to find the longest increasing subsequence in an array.

	private static int lis(int arr[], int n) {
		int lis[] = new int[n];

		for (int i = 0; i < n; i++)
			lis[i] = 1;
		for (int i = 1; i < n; i++)
			for (int prev = 0; prev < i; prev++)
				if (arr[i] > arr[prev] && lis[i] < lis[prev] + 1)
					lis[i] = lis[prev] + 1;

		int max = 1;
		for (int i = 0; i < n; i++)
			max = Math.max(max, lis[i]);

		return max;
	}

	public static void main(String args[]) {
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		int n = arr.length;
		System.out.println("Length of lis is " + lis(arr, n));
	}
}