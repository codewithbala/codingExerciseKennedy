package com.kabaso.mock;

public class SamOfDigitExample {
	private static int getSum(int num) {
		int sum = 0;

		while (num != 0) {
			sum = sum + num % 10;
			num = num / 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		int num = 23;
		System.out.println(getSum(num));
	}
}