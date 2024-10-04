package com.kabaso.mock.week2.task4;

public class PandrameInBinary {
	// Write a program to check if a number is a palindrome in binary form.
	public static void main(String argc[]) {
		long num = 5, n1;
		long reverse = 0;
		n1 = num;
		while (n1 > 0) {
			reverse <<= 1;
			if ((n1 & 1) == 1)
				reverse ^= 1;
			n1 >>= 1;
		}
		if (num == reverse) {
			System.out.println("Binary representation of " + num + " is palindrome");
		} else {
			System.out.println("Binary representation of " + num + " is not palindrome");
		}
	}
}
