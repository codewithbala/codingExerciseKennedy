package com.kabaso.mock.week2;

import java.util.ArrayList;

public class DigitsContentCheckExample {
	public static boolean onlyDigits(String str, int n) {
		String num = "123456789";
		ArrayList<Character> numbers = new ArrayList<Character>();
		for (int i = 0; i < num.length(); i++) {
			numbers.add(num.charAt(i));
		}
		for (int i = 0; i < n; i++) {

			if (!numbers.contains(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		String str = "234abr";
		int len = str.length();

		System.out.println(onlyDigits(str, len));
	}
}
