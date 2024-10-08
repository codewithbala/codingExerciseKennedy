package com.kabaso.mock.week3.task2;

public class TwoDMatraxExample {
	// Write a program to rotate a 2D matrix 90 degrees.
	public static void rotate90(int[][] mat) {
		int n = mat.length;

		int[][] res = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				res[n - j - 1][i] = mat[i][j];
			}
		}

		for (int i = 0; i < n; i++) {
			System.arraycopy(res[i], 0, mat[i], 0, n);
		}
	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		rotate90(mat);
		for (int[] row : mat) {
			for (int x : row) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}
}