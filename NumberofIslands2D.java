package com.kabaso.mock.week10.task3;

class NumberofIslands2D {
	// Write a program to find the number of islands in a 2D matrix using DFS.
	public int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0) {
			return 0;
		}

		int numRows = grid.length;
		int numCols = grid[0].length;
		int numIslands = 0;

		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) {
				if (grid[i][j] == '1') {
					numIslands++;
					dfs(grid, i, j);
				}
			}
		}

		return numIslands;
	}

	private void dfs(char[][] grid, int row, int col) {
		if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == '0') {
			return;
		}

		grid[row][col] = '0';

		dfs(grid, row + 1, col);
		dfs(grid, row - 1, col);
		dfs(grid, row, col + 1);
		dfs(grid, row, col - 1);
	}
}