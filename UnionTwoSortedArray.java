package com.kabaso.mock;

import java.util.ArrayList;
import java.util.TreeSet;

public class UnionTwoSortedArray {
	// Write a program to merge two sorted arrays.
	public static ArrayList<Integer> Unionarray(int arr1[], int arr2[], int n, int m) {
		TreeSet<Integer> set = new TreeSet<>();
		// First array added to set
		for (int i : arr1)
			set.add(i);

		// Second array added to set
		for (int i : arr2)
			set.add(i);

		// Converting set to array list
		ArrayList<Integer> list = new ArrayList<>();
		for (int i : set)
			list.add(i);

		return list;
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 2, 2, 3 };
		int arr2[] = { 2, 3, 3, 4, 5, 5 };
		int n = arr1.length;
		int m = arr2.length;

		ArrayList<Integer> uni = Unionarray(arr1, arr2, n, m);
		for (int i : uni) {
			System.out.print(i + " ");
		}
	}
}
