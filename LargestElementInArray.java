package com.kabaso.mock;

public class LargestElementInArray {

	public static void main(String[] args) {
		// Write a program to find the largest element in an array.
		int max = 0;
		int arr[] = { 2, 4, 6, 1, 8, 9, 5 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			return;

		}
		 System.out.println("The largest element in the array is: " + max);
	}
}
