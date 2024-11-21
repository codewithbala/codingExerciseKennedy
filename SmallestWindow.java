package com.kabaso.mock.week11.task4;

import java.util.HashMap;

public class SmallestWindow {
//Write a program to find the smallest window in a string that contains all characters of another string. 
	public static String findSmallestWindow(String str, String pattern) {
		if (str == null || pattern == null || str.length() < pattern.length()) {
			return "";
		}

		HashMap<Character, Integer> patternFreq = new HashMap<>();
		for (char c : pattern.toCharArray()) {
			patternFreq.put(c, patternFreq.getOrDefault(c, 0) + 1);
		}

		int requiredChars = patternFreq.size();
		int formedChars = 0;
		int minWindowLength = Integer.MAX_VALUE;
		int minWindowStart = 0;

		int left = 0;
		HashMap<Character, Integer> windowFreq = new HashMap<>();

		for (int right = 0; right < str.length(); right++) {
			char c = str.charAt(right);
			windowFreq.put(c, windowFreq.getOrDefault(c, 0) + 1);

			if (patternFreq.containsKey(c) && windowFreq.get(c).equals(patternFreq.get(c))) {
				formedChars++;
			}

			while (formedChars == requiredChars) {
				if (right - left + 1 < minWindowLength) {
					minWindowLength = right - left + 1;
					minWindowStart = left;
				}

				char leftChar = str.charAt(left);
				windowFreq.put(leftChar, windowFreq.get(leftChar) - 1);

				if (patternFreq.containsKey(leftChar) && windowFreq.get(leftChar) < patternFreq.get(leftChar)) {
					formedChars--;
				}

				left++;
			}
		}

		return minWindowLength == Integer.MAX_VALUE ? ""
				: str.substring(minWindowStart, minWindowStart + minWindowLength);
	}

	public static void main(String[] args) {
		String str = "ADOBECODEBANC";
		String pattern = "ABC";
		System.out.println("Smallest Window: " + findSmallestWindow(str, pattern));
	}
}