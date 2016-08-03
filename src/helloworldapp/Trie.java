/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import static java.lang.System.out;
import javax.accessibility.AccessibleText;

/**
 *
 * @author v-xuzhon
 */
public class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode n = root;
        int deep = 0;
        for (char c : word.toCharArray()) {
            deep++;
            
            if (n.children[c - 'a'] == null) {

                n.children[c - 'a'] = new TrieNode();
                n.children[c - 'a'].deep = deep;
            }

            n = n.children[c - 'a'];
        }

        n.isWord = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode n = findWordPos(word);
        return n != null && n.isWord && n.deep == word.length();
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode n = findWordPos(prefix);
        return n != null && n.deep == prefix.length();
    }

    private TrieNode findWordPos(String word) {
        TrieNode n = root;

        for (char c : word.toCharArray()) {
            TrieNode nc = n.children[c - 'a'];
            
            if (nc == null) {
                return null;
            }

            n = nc;
        }

        return n;
    }

    private void T() {
        boolean r;
        insert("lintcode");
        r = search("code"); // return false
        System.out.println(r);
        r = startsWith("lint"); // return true
        System.out.println(r);
        r = startsWith("linterror"); // return false
        System.out.println(r);
        insert("linterror");
        r = search("lintcode"); // return true
        System.out.println(r);
        r = startsWith("linterror"); // return true
        System.out.println(r);
    }

    public static void Test() {
        Trie t = new Trie();
        t.T();
    }
}
