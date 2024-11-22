package com.kabaso.mock.week11.task5;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

//Write a program to implement a simple cache using LRU (Least Recently Used) eviction policy.
public class LRUCache<K, V> {
	private final int capacity;
	private final Map<K, V> cache;

	public LRUCache(int capacity) {
		if (capacity <= 0)
			throw new IllegalArgumentException("Capacity must be greater than 0");
		this.capacity = capacity;
		this.cache = new LinkedHashMap<>(capacity, 0.75f, true);
	}

	public V get(K key) {
		return cache.getOrDefault(key, null);
	}

	public void put(K key, V value) {
		if (cache.size() >= capacity) {
			evict();
		}
		cache.put(key, value);
	}

	private void evict() {
		Iterator<Map.Entry<K, V>> iterator = cache.entrySet().iterator();
		if (iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
	}

	public void display() {
		System.out.println(cache);
	}

	public static void main(String[] args) {
		LRUCache<Integer, String> lruCache = new LRUCache<>(3);

		lruCache.put(1, "One");
		lruCache.put(2, "Two");
		lruCache.put(3, "Three");

		lruCache.display();

		System.out.println("Get 1: " + lruCache.get(1));
		lruCache.display();

		lruCache.put(4, "Four");
		lruCache.display();

		lruCache.put(5, "Five");
		lruCache.display();
	}
}
