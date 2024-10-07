package com.kabaso.mock.week3.task1;

public class BinaryToDecemalExample {
	// Write a program to convert a binary number to decimal.
	public static void main(String args[]) {
		String binaryString = "10101";

		int decimal = Integer.parseInt(binaryString, 2);
		System.out.println(decimal);
	}
}