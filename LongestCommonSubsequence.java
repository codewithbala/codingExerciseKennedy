package com.kabaso.mock.week10.task4;
public class LongestCommonSubsequence {
	//Write a program to solve the longest palindromic subsequence problem.
    public static String findLCS(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        
        int[][] dp = new int[m + 1][n + 1];
        
         for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        StringBuilder lcs = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                lcs.append(str1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        
        return lcs.reverse().toString();
    }

    public static void main(String[] args) {
        String str1 = "ABCBDAB";
        String str2 = "BDCAB";
        
        System.out.println("Longest Common Subsequence: " + findLCS(str1, str2));
    }
}
