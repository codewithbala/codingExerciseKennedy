package com.kabaso.mock;

import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]) {
		// Palindrome Check: Write a Java program to check if a given string is a
		// palindrome or not.
		// A palindrome is symmetric around its center eg theht
		
		String firstString;
		String secondString = "";

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");

		firstString = in.nextLine();
		int length = firstString.length();

		for (int i = length - 1; i >= 0; i--)
			secondString = secondString + firstString.charAt(i);
		
		if (firstString.equals(secondString))
			System.out.println("The entered string is a palindrome.");
		else
			System.out.println("The entered string is not  palindrome.");
	}
}