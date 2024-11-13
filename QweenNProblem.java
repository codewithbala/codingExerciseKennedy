package com.kabaso.mock.week10.task2;

import java.util.Arrays;

public class QweenNProblem {
	// Write a program to solve the N-Queens problem.
	private static int N;

	public static void main(String[] args) {
		N = 4;
		int[][] board = new int[N][N];
		for (int[] row : board) {
			Arrays.fill(row, 0);
		}

		if (solveNQueens(board, 0)) {
			printSolution(board);
		} else {
			System.out.println("No solution exists");
		}
	}

	private static boolean solveNQueens(int[][] board, int col) {
		if (col >= N) {
			return true;
		}

		for (int i = 0; i < N; i++) {
			if (isSafe(board, i, col)) {
				board[i][col] = 1;

				if (solveNQueens(board, col + 1)) {
					return true;
				}

				board[i][col] = 0; // Backtrack
			}
		}

		return false;
	}

	private static boolean isSafe(int[][] board, int row, int col) {
			for (int i = 0; i < col; i++) {
			if (board[row][i] == 1) {
				return false;
			}
		}

		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}

		for (int i = row, j = col; i < N && j >= 0; i++, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}

		return true;
	}

	private static void printSolution(int[][] board) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(board[i][j] == 1 ? "Q " : ". ");
			}
			System.out.println();
		}
	}
}
