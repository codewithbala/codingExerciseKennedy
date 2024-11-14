package com.kabaso.mock.week10.task3;
public class TrieNode {
    //Write a program to implement a Trie (Prefix Tree).
    // Array for child nodes of each node
    TrieNode[] child;
    
    // Used for indicating the end of a string
    boolean wordEnd;

    // Constructor
    public TrieNode() {
      
        // Initialize the wordEnd 
        // variable with false
        wordEnd = false;

        // Initialize every index of 
        // the child array with null
        // In Java, we do not have to 
        // explicitely assign null as 
        // the values are by default 
        // assigned as null 
        child = new TrieNode[26];
    }
}
