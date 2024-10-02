package com.kabaso.mock.week2;

class LongestCommonPrefix {
	public String longestCommonPrefix(String[] S) {
		// Write a program to find the longest common prefix of an array of strings.
		if (S.length == 0)
			return "";
		String prefix = S[0];
		for (int i = 1; i < S.length; i++)
			while (S[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty())
					return "";
			}
		return prefix;
	}

	public static void main(String args[]) {

		LongestCommonPrefix ob = new LongestCommonPrefix();
		String s[] = { "king", "kong", "kicking" };
		System.out.println(ob.longestCommonPrefix(s));
	}
}