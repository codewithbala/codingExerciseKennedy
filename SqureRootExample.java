package com.kabaso.mock.week2.task3;

public class SqureRootExample {
//Write a program to find the square root of a number without using built-in methods.
	// Function to calculate square root using binary search
	public static double squareRoot(double number, double precision) {
		if (number < 0) {
			System.out.println("Invalid Input.");
			return -1;
		}

		double start = 0;
		double end = number;
		double mid = 0;
		while ((end - start) > precision) {
			mid = (start + end) / 2;

			if (mid * mid == number) {
				return mid;
			} else if (mid * mid < number) {
				start = mid;
			} else {
				end = mid;
			}
		}

		return mid;
	}

	public static void main(String[] args) {
		double number = 10;
		double precision = 0.00001;

		double result = squareRoot(number, precision);
		System.out.println("Square root of " + number + " is approximately: " + result);
	}
}