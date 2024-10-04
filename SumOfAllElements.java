package com.kabaso.mock.week2.task4;

public class SumOfAllElements {
	// Write a program to find the sum of all elements in an array.
	public static void main(String[] args) {

		int sum = 0;
		int[] arr = { 8, 3, 4, 2, 6, 8, 1, 2 };
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			System.out.println("The sum of all the elements is  :" + sum);
		}

	}
}