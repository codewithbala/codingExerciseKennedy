package com.kabaso.mock.week8;
//Write a program to implement a graph using adjacency matrix and perform depth-first search (DFS).
public class Graph {
	private int vertices;
	private int[][] adjMatrix;
	private boolean[] visited;

	public Graph(int vertices) {
		this.vertices = vertices;
		this.adjMatrix = new int[vertices][vertices];
		this.visited = new boolean[vertices];
	}

	public void addEdge(int source, int destination) {
		adjMatrix[source][destination] = 1;
		adjMatrix[destination][source] = 1; 
	}

	public void DFS(int startVertex) {
		visited[startVertex] = true;
		System.out.print(startVertex + " ");

		for (int i = 0; i < vertices; i++) {
			if (adjMatrix[startVertex][i] == 1 && !visited[i]) {
				DFS(i);
			}
		}
	}

	public static void main(String[] args) {
		Graph graph = new Graph(5);

		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);

		System.out.println("Depth First Traversal:");
		graph.DFS(0);
	}
}