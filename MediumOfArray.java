package com.kabaso.mock.week5;

import java.util.Arrays;

public class MediumOfArray {
	// Write a program to find the median of two sorted arrays.
	public static double medianOf2(int[] arr1, int[] arr2) {

		int[] arr3 = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);

		Arrays.sort(arr3);
		int n = arr3.length;

		if (n % 2 == 0) {
			int mid1 = n / 2;
			int mid2 = mid1 - 1;
			return (arr3[mid1] + arr3[mid2]) / 2.0;
		} else {
			return arr3[n / 2];
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { -5, 3, 6, 12, 15 };
		int[] arr2 = { -12, -10, -6, -3, 4, 10 };

		System.out.println(medianOf2(arr1, arr2));
	}
}
