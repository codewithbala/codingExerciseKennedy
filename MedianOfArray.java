package com.kabaso.mock.week3.task1;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfArray {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");

		int len = sc.nextInt();

		int[] inputArray = new int[len];
		System.out.println("Enter the elements: ");

		for (int i = 0; i < len; i++) {

			inputArray[i] = sc.nextInt();
		}

		System.out.println("Mean of given array " + Arrays.toString(inputArray) + " is = " + mean(inputArray, len));
		System.out.println("Median of given array " + Arrays.toString(inputArray) + " is = " + median(inputArray, len));
	}

	public static double mean(int arr[], int len) {

		int sum = 0;

		for (int i = 0; i < len; i++)
			sum += arr[i];

		return (double) sum / (double) len;
	}

	public static double median(int arr[], int len) {
		Arrays.sort(arr);

		if (len % 2 != 0) {
			return (double) arr[len / 2];
		}
		System.out.println(arr[(len - 1)]);
		System.out.println(arr[(len - 1)]);
		return (double) (arr[(len - 1) / 2] + arr[len / 2]) / 2.0;
	}
}
