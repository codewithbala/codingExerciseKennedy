package com.kabaso.mock.week5;

public class TrieNode {

	TrieNode[] child;

	boolean wordEnd;

	public TrieNode() {

		wordEnd = false;

		child = new TrieNode[26];
	}
}
