package com.kabaso.mock.week2.task4;

public class PowerOfNumber {
	// Write a program to find the power of a number (exponentiation).

	public static int power(int x, int n) {

		if (n == 0)
			return 1;

		if (x == 0)
			return 0;

		return x * power(x, n - 1);
	}

	public static void main(String[] args) {
		int x = 2;
		int y = 3;

		System.out.println(power(x, y));
	}
}
