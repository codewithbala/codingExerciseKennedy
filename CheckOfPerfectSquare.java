package com.kabaso.mock.week2.task3;

public class CheckOfPerfectSquare {
	// Write a program to check if a number is perfect number
	static long sum = 0;

	private static long isPerfect(long num, int i) {
		if (i <= num / 2) {
			if (num % i == 0) {
				sum = sum + i;
			}

			i++;

			isPerfect(num, i);
		}
		return sum;
	}

	public static void main(String args[]) {
		long number = 28, s;
		int i = 1;

		s = isPerfect(number, i);

		if (s == number)
			System.out.println(number + " is a perfect number");
		else
			System.out.println(number + " is not a perfect number");
	}

}
