package com.kabaso.mock.week10.task4;

import java.util.HashMap;

class LRUCache {
	// Write a program to implement a LRU (Least Recently Used) Cache.
	private final int capacity;
	private final HashMap<Integer, Node> cache;
	private final Node head, tail;

	private static class Node {
		int key, value;
		Node prev, next;

		Node(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.cache = new HashMap<>(capacity);
		this.head = new Node(0, 0);
		this.tail = new Node(0, 0);
		head.next = tail;
		tail.prev = head;
	}

	public int get(int key) {
		if (!cache.containsKey(key))
			return -1;

		Node node = cache.get(key);
		remove(node);
		insertToHead(node);
		return node.value;
	}

	public void put(int key, int value) {
		if (cache.containsKey(key)) {
			Node node = cache.get(key);
			node.value = value;
			remove(node);
			insertToHead(node);
		} else {
			if (cache.size() == capacity) {
				cache.remove(tail.prev.key);
				remove(tail.prev);
			}
			Node newNode = new Node(key, value);
			cache.put(key, newNode);
			insertToHead(newNode);
		}
	}

	private void remove(Node node) {
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}

	private void insertToHead(Node node) {
		node.next = head.next;
		node.prev = head;
		head.next.prev = node;
		head.next = node;
	}

	public static void main(String[] args) {
		LRUCache lruCache = new LRUCache(2);
		lruCache.put(1, 1);
		lruCache.put(2, 2);
		System.out.println(lruCache.get(1));
		lruCache.put(3, 3);
		System.out.println(lruCache.get(2));
		lruCache.put(4, 4);
		System.out.println(lruCache.get(1));
		System.out.println(lruCache.get(3));
		System.out.println(lruCache.get(4));
	}
}
