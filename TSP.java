package com.kabaso.mock.week10.task2;

import java.util.Arrays;

public class TSP {
//Write a program to solve the Traveling Salesman Problem using Dynamic Programming. 
	private static int N;
	private static int[][] dist;
	private static int[][] memo;
	private static final int INF = Integer.MAX_VALUE / 2;

	public static int tsp(int pos, int visited) {
		if (visited == (1 << N) - 1) {
			return dist[pos][0];
		}

		if (memo[pos][visited] != -1) {
			return memo[pos][visited];
		}

		int ans = INF;
		for (int next = 0; next < N; next++) {
			if ((visited & (1 << next)) == 0) {
				ans = Math.min(ans, dist[pos][next] + tsp(next, visited | (1 << next)));
			}
		}

		return memo[pos][visited] = ans;
	}

	public static void main(String[] args) {
		N = 4;
		dist = new int[][] { { 0, 10, 15, 20 }, { 10, 0, 35, 25 }, { 15, 35, 0, 30 }, { 20, 25, 30, 0 } };

		memo = new int[N][1 << N];
		for (int[] row : memo) {
			Arrays.fill(row, -1);
		}

		int minCost = tsp(0, 1);
		System.out.println("Minimum cost: " + minCost);
	}
}