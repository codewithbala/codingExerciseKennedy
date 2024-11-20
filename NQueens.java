package com.kabaso.mock.week11.task3;

import java.util.Arrays;

public class NQueens {
//Write a program to solve the N-Queens problem using backtracking. 
	private int N;
	private int[][] board;

	public NQueens(int N) {
		this.N = N;
		this.board = new int[N][N];
	}

	public boolean isSafe(int row, int col) {
		for (int i = 0; i < row; i++) {
			if (board[i][col] == 1) {
				return false;
			}
		}

		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}
		for (int i = row, j = col; i >= 0 && j < N; i--, j++) {
			if (board[i][j] == 1) {
				return false;
			}
		}

		return true;
	}

	public boolean solveNQUtil(int row) {
		if (row >= N) {
			printSolution();
			return true;
		}

		for (int col = 0; col < N; col++) {
			if (isSafe(row, col)) {
				board[row][col] = 1;

				if (solveNQUtil(row + 1)) {
					return true;
				}

				board[row][col] = 0;
			}
		}

		return false;
	}

	public void solveNQueens() {
		if (!solveNQUtil(0)) {
			System.out.println("Solution does not exist");
		}
	}

	public void printSolution() {
		for (int[] row : board) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println();
	}

	public static void main(String[] args) {
		NQueens problem = new NQueens(4);
		problem.solveNQueens();
	}
}