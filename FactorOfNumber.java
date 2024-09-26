package com.kabaso.mock;

public class FactorOfNumber {
	// Write a program to print the factors of a number.
	public static void main(String[] args) {

		int num = 9;

		System.out.println("Factors of " + num + " are ");

			for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				System.out.println(i + " ");
		}

	}
}