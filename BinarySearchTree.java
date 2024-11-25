package com.kabaso.mock.week12.task1;

//Write a program to implement a binary search tree (BST) and perform insertion and searching.
class BinarySearchTree {

	class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	public void insert(int data) {
		root = insertRec(root, data);
	}

	private Node insertRec(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}

		if (data < root.data) {
			root.left = insertRec(root.left, data);
		} else if (data > root.data) {
			root.right = insertRec(root.right, data);
		}

		return root;
	}

	public boolean search(int data) {
		return searchRec(root, data);
	}

	private boolean searchRec(Node root, int data) {
		if (root == null) {
			return false;
		}
		if (data == root.data) {
			return true;
		}

		if (data > root.data) {
			return searchRec(root.right, data);
		}

		return searchRec(root.left, data);
	}

	public void inorder() {
		inorderRec(root);
	}

	private void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.data + " ");
			inorderRec(root.right);
		}
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();

		bst.insert(50);
		bst.insert(30);
		bst.insert(20);
		bst.insert(40);
		bst.insert(70);
		bst.insert(60);
		bst.insert(80);

		System.out.println("Inorder traversal of the BST:");
		bst.inorder();
		System.out.println("\nSearching for 40 in the BST: " + bst.search(40));
		System.out.println("Searching for 25 in the BST: " + bst.search(25));
	}
}
