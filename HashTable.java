package com.kabaso.mock.week11.task5;
import java.util.LinkedList;

public class HashTable {
//Write a program to implement a hash table with collision handling using chaining. 
    private static class HashNode {
        String key;
        String value;

        HashNode(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<HashNode>[] table;
    private int capacity;

    public HashTable(int capacity) {
        this.capacity = capacity;
        this.table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(String key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(String key, String value) {
        int index = hash(key);
        LinkedList<HashNode> bucket = table[index];

        for (HashNode node : bucket) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }

        bucket.add(new HashNode(key, value));
    }

    public String get(String key) {
        int index = hash(key);
        LinkedList<HashNode> bucket = table[index];

        for (HashNode node : bucket) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }

        return null;
    }

    public void remove(String key) {
        int index = hash(key);
        LinkedList<HashNode> bucket = table[index];

        for (HashNode node : bucket) {
            if (node.key.equals(key)) {
                bucket.remove(node);
                return;
            }
        }
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable(10);
        ht.put("one", "1");
        ht.put("two", "2");
        ht.put("three", "3");
        System.out.println(ht.get("one"));
        ht.remove("two");
        System.out.println(ht.get("two")); 
    }
}