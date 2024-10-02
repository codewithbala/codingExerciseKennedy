package com.kabaso.mock.week2;

public class NonRepetativeCharactor {
	// Write a program to find the first non-repeating character in a string
	public static void main(String[] args) {
		String str1 = "steven";

		System.out.println("The given string is: " + str1);

		for (int i = 0; i < str1.length(); i++) {
			boolean unique = true;

			for (int j = 0; j < str1.length(); j++) {
				if (i != j && str1.charAt(i) == str1.charAt(j)) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.println("The first non-repeated character in the String is: " + str1.charAt(i));
				break;
			}
		}
	}
}
