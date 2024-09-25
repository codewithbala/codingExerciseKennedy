package com.kabaso.mock;

public class AnalagramExample {

	// Write a program to check if two strings are anagrams.
	public static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		int[] count = new int[26];

		for (char c : s1.toCharArray()) {
			count[c - 'a']++;
		}

		for (char c : s2.toCharArray()) {
			count[c - 'a']--;
		}

		for (int i = 0; i < 26; i++) {
			if (count[i] != 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String s1 = "kennedy";
		String s2 = "ydennek";
		System.out.println(isAnagram(s1, s2));

	}

}
