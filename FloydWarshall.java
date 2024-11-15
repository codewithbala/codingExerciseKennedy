package com.kabaso.mock.week10.task4;
import java.util.Arrays;

public class FloydWarshall {

    public static void main(String[] args) {
        int[][] graph = {
                {0, 5, Integer.MAX_VALUE, 10},
                {Integer.MAX_VALUE, 0, 3, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 1},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0}
        };

        int[][] shortestPaths = floydWarshall(graph);

        // Print the shortest paths matrix
        for (int[] row : shortestPaths) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] floydWarshall(int[][] graph) {
        int V = graph.length;
        int[][] dist = new int[V][V];

        // Initialize the distance matrix with values from the graph
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                dist[i][j] = graph[i][j];
            }
        }

        // Main Floyd-Warshall algorithm
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE && 
                        dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        return dist;
    }
}