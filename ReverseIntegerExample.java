package com.kabaso.mock;

public class ReverseIntegerExample {

	// Write a program to reverse an integer.
	static int num = 124;

	private static int reversDigits(int num) {
		StringBuffer string = new StringBuffer(String.valueOf(num));
		string.reverse();
		num = Integer.parseInt(String.valueOf(string));
		return num;
	}

	public static void main(String[] args) {
		System.out.println("Reverse of number is " + reversDigits(num));
	}
}