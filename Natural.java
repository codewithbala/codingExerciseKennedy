package com.kabaso.mock.week2.task3;

public class Natural {
	// Write a program to find the sum of the first n natural numbers.
	public static int naturalNumberSum(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++)
			sum = sum + i;
		return sum;
	}

	public static void main(String args[]) {
		int num = 50;
		System.out.println("Sum of Natural Numbers is: " + naturalNumberSum(num));
	}
}
