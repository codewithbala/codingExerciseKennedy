package com.kabaso.mock.week11.task3;

public class CountingSort {
//Write a program to implement a counting sort algorithm. 
	public static void countingSort(int[] arr) {
		int max = findMax(arr);
		int[] count = new int[max + 1];
		for (int num : arr) {
			count[num]++;
		}

		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}

		int[] sortedArr = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			int num = arr[i];
			sortedArr[count[num] - 1] = num;
			count[num]--;
		}

		System.arraycopy(sortedArr, 0, arr, 0, arr.length);
	}

	private static int findMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 2, 2, 8, 3, 3, 1 };
		countingSort(arr);

		System.out.println("Sorted array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}