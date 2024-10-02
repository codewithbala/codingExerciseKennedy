package com.kabaso.mock.week2;

public class LongestSubString {
	// Write a program to find the longest substring without repeating characters.
	private static int longestUniqueSubstr(String s) {
		if (s.length() == 0)
			return 0;

		if (s.length() == 1)
			return 1;

		int maxLength = 0;
		boolean[] visited = new boolean[256];

		int left = 0, right = 0;
		while (right < s.length()) {
			while (visited[s.charAt(right)]) {
				visited[s.charAt(left)] = false;
				left++;
			}

			visited[s.charAt(right)] = true;
			maxLength = Math.max(maxLength, (right - left + 1));
			right++;
		}
		return maxLength;
	}

	public static void main(String[] args) {
		String s = "kennedyiscoming";
		System.out.println(longestUniqueSubstr(s));
	}
}
