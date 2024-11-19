package com.kabaso.mock.week11.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class AStar {
//Write a program to implement the A search algorithm for pathfinding.* 
	public static List<Node> findPath(Node start, Node goal) {
		PriorityQueue<Node> openSet = new PriorityQueue<>(Comparator.comparingInt(Node::getF));
		Set<Node> closedSet = new HashSet<>();

		start.setG(0);
		start.setH(heuristic(start, goal));
		openSet.add(start);

		while (!openSet.isEmpty()) {
			Node current = openSet.poll();

			if (current.equals(goal)) {
				return reconstructPath(current);
			}

			closedSet.add(current);

			for (Node neighbor : current.getNeighbors()) {
				if (closedSet.contains(neighbor)) {
					continue;
				}

				int tentativeG = current.getG() + neighbor.getCost();

				if (!openSet.contains(neighbor) || tentativeG < neighbor.getG()) {
					neighbor.setParent(current);
					neighbor.setG(tentativeG);
					neighbor.setH(heuristic(neighbor, goal));

					if (!openSet.contains(neighbor)) {
						openSet.add(neighbor);
					}
				}
			}
		}

		return null;
	}

	private static List<Node> reconstructPath(Node current) {
		List<Node> path = new ArrayList<>();
		while (current != null) {
			path.add(0, current);
			current = current.getParent();
		}
		return path;
	}

	private static int heuristic(Node node, Node goal) {
		return Math.abs(node.getX() - goal.getX()) + Math.abs(node.getY() - goal.getY());
	}

	static class Node {
		int x, y;
		int g, h;
		Node parent;
		List<Node> neighbors;

		public Node(int x, int y, int g, int h, Node parent, List<Node> neighbors) {
			super();
			this.x = x;
			this.y = y;
			this.g = g;
			this.h = h;
			this.parent = parent;
			this.neighbors = neighbors;
		}

		public Node() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public int getG() {
			return g;
		}

		public void setG(int g) {
			this.g = g;
		}

		public int getH() {
			return h;
		}

		public void setH(int h) {
			this.h = h;
		}

		public Node getParent() {
			return parent;
		}

		public void setParent(Node parent) {
			this.parent = parent;
		}

		public List<Node> getNeighbors() {
			return neighbors;
		}

		public void setNeighbors(List<Node> neighbors) {
			this.neighbors = neighbors;
		}

	}
}