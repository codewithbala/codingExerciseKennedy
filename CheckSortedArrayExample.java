package com.kabaso.mock;

public class CheckSortedArrayExample {
	// Write a program to check if an array is sorted.
	public static boolean isSorted(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 2, 4, 5 };

		System.out.println("Is arr1 sorted? " + isSorted(arr1));
	}
}
