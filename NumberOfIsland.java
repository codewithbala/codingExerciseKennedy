package com.kabaso.mock.week3.task3;

public class NumberOfIsland {
	// Write a program to find the number of islands in a 2D grid.
	private static void DFS(char[][] M, int r, int c) {
		int ROW = M.length;
		int COL = M[0].length;
		if (r < 0 || c < 0 || r >= ROW || c >= COL || M[r][c] != '1') {
			return;
		}
		M[r][c] = '0';

		int[] rNbr = { 1, -1, 0, 0, 1, -1, 1, -1 };
		int[] cNbr = { 0, 0, 1, -1, 1, -1, -1, 1 };

		for (int i = 0; i < 8; ++i) {
			int newR = r + rNbr[i];
			int newC = c + cNbr[i];
			DFS(M, newR, newC);
		}
	}

	private static int countIslands(char[][] M) {
		int ROW = M.length;
		int COL = M[0].length;
		int count = 0;
		for (int r = 0; r < ROW; r++) {
			for (int c = 0; c < COL; c++) {
				if (M[r][c] == '1') {

					count++;
					DFS(M, r, c);
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		char[][] M = { { '1', '1', '0', '0', '0' }, { '0', '1', '0', '0', '1' }, { '1', '0', '0', '1', '1' },
				{ '0', '0', '0', '0', '0' }, { '1', '0', '1', '1', '0' } };

		System.out.println(countIslands(M));
	}
}