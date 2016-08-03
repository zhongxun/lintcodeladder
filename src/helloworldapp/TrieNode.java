/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author v-xuzhon
 */
public class TrieNode {

    public TrieNode[] children;
    public boolean isWord;
    public int deep;
    
    // Initialize your data structure here.
    public TrieNode() {
        this.isWord = false;
        this.children = new TrieNode[26];        
        this.deep = 0;
    }    
}
