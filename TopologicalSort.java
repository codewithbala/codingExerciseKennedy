package com.kabaso.mock.week11.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopologicalSort {
	// Write a program to implement topological sorting using Kahn's algorithm.
	public static List<Integer> topologicalSort(List<List<Integer>> adj) {
		int numNodes = adj.size();
		int[] inDegree = new int[numNodes];
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < numNodes; i++) {
			for (int neighbor : adj.get(i)) {
				inDegree[neighbor]++;
			}
		}

		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < numNodes; i++) {
			if (inDegree[i] == 0) {
				queue.offer(i);
			}
		}

		while (!queue.isEmpty()) {
			int node = queue.poll();
			result.add(node);

			for (int neighbor : adj.get(node)) {
				inDegree[neighbor]--;
				if (inDegree[neighbor] == 0) {
					queue.offer(neighbor);
				}
			}
		}

		if (result.size() != numNodes) {
			return new ArrayList<>();
		}

		return result;
	}

	public static void main(String[] args) {
		List<List<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			adj.add(new ArrayList<>());
		}
		adj.get(2).add(3);
		adj.get(3).add(1);
		adj.get(4).add(0);
		adj.get(4).add(1);
		adj.get(5).add(0);
		adj.get(5).add(2);

		List<Integer> sortedOrder = topologicalSort(adj);
		System.out.println(sortedOrder);
	}
}