package com.kabaso.mock;

import java.util.HashSet;

public class UnionTwoArrays {
	// Write a program to find the union of two arrays.
	private static void getUnion(int a[], int n, int b[], int m) {

		HashSet<Integer> s = new HashSet<>();

		for (int i = 0; i < n; i++)
			s.add(a[i]);

		for (int i = 0; i < m; i++)
			s.add(b[i]);
		   System.out.print("Total Number of elements in union operation: " + s.size() + "\n");
		  System.out.print("The union set of both arrays is :" + "\n");

		System.out.print(s.toString() + " ");

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 6, 2, 3, 5, 7, 3 };
		int b[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4 };

		getUnion(a, 9, b, 10);
	}
}
