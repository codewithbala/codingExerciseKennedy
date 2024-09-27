package com.kabaso.mock;

public class SecondGElement {
	// Write a program to find the second largest element in an array.
	private static int getSecondLargest(int[] arr) {

		int largest = -1;
		int secondLargest = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest)
				largest = arr[i];
		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 5, 52, 13, 19, 34, 1 };
		System.out.println(getSecondLargest(arr));
	}
}
