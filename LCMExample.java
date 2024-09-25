package com.kabaso.mock;

import java.util.Scanner;

public class LCMExample {
	// Write a program to find the least common multiple (LCM) of two numbers.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 68;
		int b = 34;
		int lcm = findLCM(a, b);
		
		System.out.println("LCM of " + a + " and " + b + " is " + lcm);
	}

	public static int findLCM(int a, int b) {
		int greater = Math.max(a, b);
		int smaller = Math.min(a, b);
		for (int i = greater;; i += greater) {
			if (i % smaller == 0)
				return i;
		}
	}
}
