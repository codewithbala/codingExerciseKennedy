package com.kabaso.mock.week11.task4;

public class MaxSumRectangle {
	// Write a program to find the maximum sum rectangle in a 2D matrix.
	public static int findMaxSumRectangle(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int maxSum = Integer.MIN_VALUE;
		int[][] memo = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				for (int k = i; k < rows; k++) {
					for (int l = j; l < cols; l++) {
						int sum = calculateSubMatrixSum(matrix, i, j, k, l, memo);
						maxSum = Math.max(maxSum, sum);
					}
				}
			}
		}

		return maxSum;
	}

	public static int calculateSubMatrixSum(int[][] matrix, int startRow, int startCol, int endRow, int endCol,
			int[][] memo) {
		if (startRow == 0 && startCol == 0) {
			return memo[endRow][endCol];
		} else if (startRow == 0) {
			return memo[endRow][endCol] - memo[endRow][startCol - 1];
		} else if (startCol == 0) {
			return memo[endRow][endCol] - memo[startRow - 1][endCol];
		} else {
			return memo[endRow][endCol] - memo[endRow][startCol - 1] - memo[startRow - 1][endCol]
					+ memo[startRow - 1][startCol - 1];
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, -1, -4, -20 }, { -8, -3, 4, 2, 1 }, { 3, 8, 10, 1, 3 }, { -4, -1, 1, 7, -6 } };

		int[][] memo = new int[matrix.length][matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (i == 0 && j == 0) {
					memo[i][j] = matrix[i][j];
				} else if (i == 0) {
					memo[i][j] = memo[i][j - 1] + matrix[i][j];
				} else if (j == 0) {
					memo[i][j] = memo[i - 1][j] + matrix[i][j];
				} else {
					memo[i][j] = memo[i - 1][j] + memo[i][j - 1] - memo[i - 1][j - 1] + matrix[i][j];
				}
			}
		}

		int result = findMaxSumRectangle(matrix);
		System.out.println("Maximum Sum Rectangle: " + result);
	}
}
