package com.kabaso.mock.week2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWord {
	// Write a program to reverse words in a string
	public static void main(String[] args) {
		String str = "I am coming home.";
		System.out.println(reverseWords(str));
	}

	public static String reverseWords(String str) {

		List<String> words = Arrays.asList(str.split(" "));
		Collections.reverse(words);
		return String.join(" ", words);
	}
}
