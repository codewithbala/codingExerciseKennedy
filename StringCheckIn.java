package com.kabaso.mock.week8;

public class StringCheckIn {

	static boolean isNumber(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "2345";

		if (isNumber(str)) {
			System.out.println("Integer");
		} else {
			System.out.println("String");
		}
	}
}
