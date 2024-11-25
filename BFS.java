package com.kabaso.mock.week12.task1;

import java.util.*;

public class BFS {
//Write a program to implement a breadth-first search (BFS) on a graph.
	private static void bfs(Map<Integer, List<Integer>> graph, int startNode) {
		Set<Integer> visited = new HashSet<>();
		Queue<Integer> queue = new LinkedList<>();

		visited.add(startNode);
		queue.add(startNode);

		while (!queue.isEmpty()) {
			int currentNode = queue.poll();
			System.out.print(currentNode + " ");

			List<Integer> neighbors = graph.getOrDefault(currentNode, new ArrayList<>());
			for (int neighbor : neighbors) {
				if (!visited.contains(neighbor)) {
					visited.add(neighbor);
					queue.add(neighbor);
				}
			}
		}
	}

	public static void main(String[] args) {
		Map<Integer, List<Integer>> graph = new HashMap<>();
		graph.put(1, Arrays.asList(2, 3));
		graph.put(2, Arrays.asList(4, 5));
		graph.put(3, Arrays.asList(6));
		graph.put(4, Collections.emptyList());
		graph.put(5, Collections.emptyList());
		graph.put(6, Collections.emptyList());

		System.out.println("BFS traversal:");
		bfs(graph, 1);
	}
}