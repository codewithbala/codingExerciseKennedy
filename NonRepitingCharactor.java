package com.kabaso.mock.week4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class NonRepitingCharactor {
	// Write a program to find the first non-repeating character in a string.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String");
		String string = s.nextLine();
		
		Set<Character> repeatingChar = new HashSet<>();
		List<Character> nonRepeatingChar = new ArrayList<>();
		
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (repeatingChar.contains(ch)) {
				continue;
			}
			if (nonRepeatingChar.contains(ch)) {
				nonRepeatingChar.remove((Character) ch);
				repeatingChar.add(ch);
			} else {
				nonRepeatingChar.add(ch);
			}
		}
		if (!nonRepeatingChar.isEmpty()) {
			char firstChar = nonRepeatingChar.get(0);
			System.out.println("The first character which is not repeating is:" + firstChar);
		} else {
			System.out.println("There is no non-repeating character in the string.");
		}
	}

}
