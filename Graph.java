package com.kabaso.mock.week9;
import java.util.ArrayList;
import java.util.Stack;
//Write a program to implement a graph using adjacency matrix and perform depth-first search (DFS)
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
        adjMatrix[destination][source] = 1; // For an undirected graph
    }

    public void dfs(int startVertex) {
        Stack<Integer> stack = new Stack<>();
        stack.push(startVertex);
        visited[startVertex] = true;

        while (!stack.isEmpty()) {
            int currentVertex = stack.pop();
            System.out.print(currentVertex + " ");

            for (int i = 0; i < vertices; i++) {
                if (adjMatrix[currentVertex][i] == 1 && !visited[i]) {
                    stack.push(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println("DFS Traversal:");
        graph.dfs(0);
    }
}