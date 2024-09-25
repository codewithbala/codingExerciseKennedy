package com.kabaso.mock;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VowelExample {
	// Write a program to count the number of vowels in a string.
	public static void main(String[] args) throws IOException {
		String str = "kennedy";
		str = str.toLowerCase();
		int count = 0;
		String vow = "aeiou";
		List<Character> vowels = new ArrayList<Character>();
		for (int i = 0; i < vow.length(); i++) {
			vowels.add(vow.charAt(i));
		}
		for (int i = 0; i < str.length(); i++) {
			if (vowels.contains(str.charAt(i))) {
				count++;
			}
		}

		System.out.println("The Number of vowels in string is: " + count);
	}

}
