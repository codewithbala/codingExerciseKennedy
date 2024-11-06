package com.kabaso.mock.week8;

import java.util.ArrayList;
import java.util.List;
//Write a program to implement a priority queue using a binary heap.
class PriorityQueue {
	static class Node {
		String task;
		int priority;

		Node(String task, int priority) {
			this.task = task;
			this.priority = priority;
		}
	}

	List<Node> heap = new ArrayList<>();

	public void insert(String task, int priority) {
		heap.add(new Node(task, priority));
		int idx = heap.size() - 1;
		while (idx != 0) {
			int parentIdx = (idx - 1) / 2;
			if (heap.get(parentIdx).priority < heap.get(idx).priority) {
				swap(parentIdx, idx);
				idx = parentIdx;
			} else {
				break;
			}
		}
	}

	public Node extractMax() {
		Node maxNode = heap.get(0);
		heap.set(0, heap.get(heap.size() - 1));
		heap.remove(heap.size() - 1);

		int idx = 0;
		while (idx < heap.size()) {
			int leftChildIdx = idx * 2 + 1;
			int rightChildIdx = idx * 2 + 2;
			int largerChildIdx = leftChildIdx;

			if (rightChildIdx < heap.size() && heap.get(rightChildIdx).priority > heap.get(leftChildIdx).priority) {
				largerChildIdx = rightChildIdx;
			}

			if (largerChildIdx < heap.size() && heap.get(largerChildIdx).priority > heap.get(idx).priority) {
				swap(largerChildIdx, idx);
				idx = largerChildIdx;
			} else {
				break;
			}
		}
		return maxNode;
	}

	private void swap(int i, int j) {
		Node temp = heap.get(i);
		heap.set(i, heap.get(j));
		heap.set(j, temp);
	}
}

public class Main {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.insert("Task 1", 1);
		pq.insert("Task 2", 2);
		while (!pq.heap.isEmpty()) {
			PriorityQueue.Node max = pq.extractMax();
			System.out.println(max.task);
		}
	}
}
