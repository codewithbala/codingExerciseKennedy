package com.kabaso.mock.week8;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetIntArr {

// Write a program to find all the subsets of a set. 
	public void displayAllSubsets(int s, ArrayList<Integer> inputArrList) {

		ArrayList<ArrayList<Integer>> answer = new ArrayList<>();

		ArrayList<Integer> tmp = new ArrayList<>();

		getSubsets(0, tmp, answer, inputArrList);
		for (int i = 0; i < answer.size(); i++) {
			Collections.sort(answer.get(i));
			System.out.print("[ ");
			for (int j = 0; j < answer.get(i).size(); j++) {
				System.out.print(answer.get(i).get(j) + " ");
			}
			System.out.print("]");
			System.out.println();
		}

	}

	private void getSubsets(int i, ArrayList<Integer> tmp, ArrayList<ArrayList<Integer>> answer,
			ArrayList<Integer> inputArrList) {

		if (i == inputArrList.size()) {
			if (tmp.size() > 0) {
				answer.add(tmp);
			}
			return;
		}
		ArrayList<Integer> tmp1 = new ArrayList<>(tmp);
		tmp1.add(inputArrList.get(i));
		getSubsets(i + 1, tmp1, answer, inputArrList);

		getSubsets(i + 1, tmp, answer, inputArrList);
	}

	public static void main(String argvs[]) {

		SubsetIntArr obj = new SubsetIntArr();

		ArrayList<Integer> arrList = new ArrayList<Integer>();

		for (int j = 1; j <= 3; j++) {
			arrList.add(j);
		}

		System.out.println("For the array list: " + arrList + " \n");

		System.out.println("The subsets are: ");

		obj.displayAllSubsets(arrList.size(), arrList);

		System.out.println();

		arrList.clear();

		for (int j = 1; j <= 5; j++) {
			arrList.add(j);
		}

		System.out.println("For the array list: " + arrList + " \n");

		System.out.println("The subsets are: ");

		obj.displayAllSubsets(arrList.size(), arrList);

	}
}