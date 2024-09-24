package com.kabaso.mock;

import java.util.Scanner;

public class PrimeExample {

	public static void main(String[] args) {
		// Write a program to check if a number is prime.
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int n = in.nextInt();

		if (isPrime(n)) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
