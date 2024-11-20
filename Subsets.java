package com.kabaso.mock.week11.task3;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
//Write a program to generate all subsets of a given set.
	public static void main(String[] args) {
		int[] set = { 1, 2, 3 };
		List<List<Integer>> subsets = generateSubsets(set);

		for (List<Integer> subset : subsets) {
			System.out.println(subset);
		}
	}

	public static List<List<Integer>> generateSubsets(int[] set) {
		List<List<Integer>> subsets = new ArrayList<>();
		int n = set.length;

		for (int i = 0; i < (1 << n); i++) {
			List<Integer> subset = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) > 0) {
					subset.add(set[j]);
				}
			}
			subsets.add(subset);
		}

		return subsets;
	}
}