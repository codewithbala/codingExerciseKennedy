package com.kabaso.mock;

public class GCDExample {
	public static void main(String[] args) {
		int a = 20, b = 98;
		System.out.println("GCD of " + a + " and " + b + " is " + findGCD(a, b));
	}

	private static int findGCD(int a, int b) {
		if (b == 0)
			return a;
		return findGCD(b, a % b);
	}
}
