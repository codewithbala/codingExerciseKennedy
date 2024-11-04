package com.kabaso.mock.week7;

import java.util.Stack;

class Node {
	int key;
	Node left, right;

	Node(int item) {
		key = item;
		left = right = null;
	}
}

public class BinaryTreeLinkidedList {
	// Write a program to flatten a binary tree to a linked list.
	public static void flatten(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Node current = stack.pop();

			if (current.right != null) {
				stack.push(current.right);
			}

			if (current.left != null) {
				stack.push(current.left);
			}

			if (!stack.isEmpty()) {
				current.right = stack.peek();
			}

			current.left = null;
		}
	}

		public static void inorder(Node root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.key + " ");
		inorder(root.right);
	}

	public static void main(String[] args) {
				Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(5);
		root.left.left = new Node(3);
		root.left.right = new Node(4);
		root.right.right = new Node(6);
		flatten(root);
		System.out.print("Inorder traversal after flattening binary tree ");
		inorder(root);
	}
}
