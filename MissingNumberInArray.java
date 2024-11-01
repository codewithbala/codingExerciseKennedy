package com.kabaso.mock.week6;

import java.util.HashSet;

public class MissingNumberInArray {
	// Write a program to find the missing number in a given array.
	public static void findMissingNumbers(int[] arr, int max) {
		HashSet<Integer> set = new HashSet<>();
		for (int num : arr) {
			set.add(num);
		}
		for (int i = 1; i <= max; i++) {
			if (!set.contains(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 6, 7 };
		int max = 7;
		System.out.println("Missing numbers in the array:");
		findMissingNumbers(arr, max);
	}
}
