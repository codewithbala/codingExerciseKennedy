package com.kabaso.mock.week12.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class DFS {
//Write a program to implement a depth-first search (DFS) on a graph.
	private static Map<Integer, List<Integer>> adjacencyList;

	public DFS() {
		adjacencyList = new HashMap<>();
	}

	public void addEdge(int source, int destination) {
		adjacencyList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
	}

	public void dfs(int startNode) {
		Set<Integer> visited = new HashSet<>();
		Stack<Integer> stack = new Stack<>();

		stack.push(startNode);

		while (!stack.isEmpty()) {
			int currentNode = stack.pop();

			if (!visited.contains(currentNode)) {
				visited.add(currentNode);
				System.out.print(currentNode + " ");

				for (int neighbor : adjacencyList.getOrDefault(currentNode, Collections.emptyList())) {
					if (!visited.contains(neighbor)) {
						stack.push(neighbor);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		DFS graph = new DFS();

		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);

		System.out.println("DFS traversal starting from vertex 2:");
		graph.dfs(2);
	}
}