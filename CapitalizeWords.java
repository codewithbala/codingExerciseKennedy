package com.kabaso.mock.week2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeWords {
	public static void main(String[] args) {
		String input = "I am coiming home";
		String result = capitalizeWords(input);

		System.out.println("Input: " + input);
		System.out.println("Output: " + result);
	}

	public static String capitalizeWords(String input) {
		return Arrays.stream(input.split("\\s")).map(word -> Character.toTitleCase(word.charAt(0)) + word.substring(1))
				.collect(Collectors.joining(" "));
	}
}