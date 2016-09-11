/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 *
 * @author v-xuzhon
 */
public class TrieService {

    class TrieNode {

        public NavigableMap<Character, TrieNode> children;
        public List<Integer> top10;

        public TrieNode() {
            children = new TreeMap<Character, TrieNode>();
            List<Integer> top10 = new ArrayList<Integer>();
        }
    }

    private TrieNode root = null;

    public TrieService() {
        root = new TrieNode();
    }

    public TrieNode getRoot() {
        // Return root of trie root, and 
        // lintcode will print the tree struct.
        return root;
    }

    // @param word a string
    // @param frequency an integer
    public void insert(String word, int frequency) {
        // Write your cod here
        if (word == null || word.length() == 0) {
            return;
        }

        TrieNode node = root;

        for (char c : word.toCharArray()) {
            if (!node.children.containsKey(c)) {
                node.children.put(c, new TrieNode());
            }

            node = node.children.get(c);
            addFrenquency(node.top10, frequency);
        }
    }

    private void addFrenquency(List<Integer> top10, Integer frequency) {
        top10.add(frequency);
        Collections.sort(top10);
        Collections.reverse(top10);
        
        while(top10.size() > 10) {
            top10.remove(top10.size() - 1);
        }
    }
}
