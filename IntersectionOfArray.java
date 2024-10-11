package com.kabaso.mock.week3.task4;

public class IntersectionOfArray {
	// Write a program to find the intersection of two arrays
	public static void main(String args[]) {
		int arr1[] = { 22, 36, 96, 16, 45 };
		int arr2[] = { 16, 45, 19, 73, 55 };
		System.out.println("Intersection of the two arrays ::");

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr2[j]);
				}
			}
		}
	}
}