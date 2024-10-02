package com.kabaso.mock.week2;

public class NumberOfWordInString {
	// Write a program to find the number of words in a string.
	public static void main(String[] args) {

		String sentence = ("I am coming home");
		String words[] = sentence.split("");

		int count = 0;
		count = count + words.length;

		System.out.println("Number of word in this sentence is " + count);

	}
}
