package com.kabaso.mock.week2;

public class LongestPadrameCheckExample {
	// Write a program to find the longest palindrome in a string.
	static int maxLength;
	static String res;

	static void cSubUtil(String s, int l, int r) {
		while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
			l--;
			r++;
		}
		if (r - l - 1 >= maxLength) {
			res = s.substring(l + 1, r);
			maxLength = r - l - 1;
		}
		return;
	}

	static int longestPalSubstr(String str) {
		res = "";
		maxLength = 1;
		for (int i = 0; i < str.length(); i++) {
			cSubUtil(str, i, i);
			cSubUtil(str, i, i + 1);
		}
		System.out.print("Longest palindrome substring is: ");
		System.out.println(res);
		return maxLength;
	}

	public static void main(String[] args) {

		String str = "forgeeksskeegfor";
		System.out.println("Length is: " + longestPalSubstr(str));
	}
}