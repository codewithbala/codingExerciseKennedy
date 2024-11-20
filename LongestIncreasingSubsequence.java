package com.kabaso.mock.week11.task3;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
//Write a program to find the longest increasing subsequence in an array. 

	public static int lengthOfLIS(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int[] dp = new int[nums.length];
		Arrays.fill(dp, 1);
		int maxLIS = 1;

		for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			maxLIS = Math.max(maxLIS, dp[i]);
		}

		return maxLIS;
	}

	public static void main(String[] args) {
		int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };
		System.out.println("Length of LIS: " + lengthOfLIS(nums));
	}
}