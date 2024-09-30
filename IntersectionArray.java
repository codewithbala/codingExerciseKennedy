package com.kabaso.mock;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionArray {
	// Write a program to find the intersection of two arrays.

	public static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2) {
		HashSet<Integer> set = new HashSet<>();
		for (int num : arr1) {
			set.add(num);
		}

		ArrayList<Integer> result = new ArrayList<>();

		// Dealing with intersections
		for (int num : arr2) {
			if (set.contains(num)) {
				result.add(num);
				set.remove(num);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 4, 5, 6 };
		int[] arr2 = { 2, 3, 5, 7 };

		ArrayList<Integer> intersection = findIntersection(arr1, arr2);
		for (int num : intersection) {
			System.out.print(num + " ");
		}
	}
}