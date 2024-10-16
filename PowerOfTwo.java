package com.kabaso.mock.week4;

public class PowerOfTwo {
	// Write a program to implement the power function (x^n)
	public static long power(int x, int n) {
		long pow = 1L;

		for (int i = 0; i < n; i++) {
			pow = pow * x;
		}

		return pow;
	}

	public static void main(String[] args) {
		int x = 2;
		int n = 3;
		System.out.println(power(x, n));
	}
}
