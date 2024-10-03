package com.kabaso.mock.week2.task3;

public class CheckPowerOfTwo {
//Write a program to check if a number is a power of two.
	public static boolean isPowerOfTwo(int number) {
		if (number <= 0) {
			return false;
		}
		return (number & (number - 1)) == 0;
	}

	public static void main(String[] args) {
		int number = 16;

		if (isPowerOfTwo(number)) {
			System.out.println(number + " is a power of two.");
		} else {
			System.out.println(number + " is not a power of two.");
		}
	}
}