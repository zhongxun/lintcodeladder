/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.HashMap;
import java.util.HashSet;
import javafx.scene.input.KeyCode;

/**
 *
 * @author v-xuzhon
 */
public class StandardBloomFilter {

    private boolean[] bf = new boolean[64];
    private int[] bfs = {61, 31, 29, 23, 19, 17, 13, 11, 7, 5, 3};
    private int k;
    private HashSet<String> hash;

    public StandardBloomFilter(int k) {
        // initialize your data structure here
        this.k = k;
        this.hash = new HashSet<>();
    }

    public void add(String word) {
        // Write your code here
        for (int i = 0; i < this.k; i++) {
            int r = Hash(word.toCharArray(), bfs[i]);
            if (r != -1) {
                bf[r] = true;
            }
        }
        hash.add(word);
    }

    public boolean contains(String word) {
        // Write your code here

        for (int i = 0; i < this.k; i++) {
            int r = Hash(word.toCharArray(), bfs[i]);
            if (r != -1) {
                if (!bf[r]) {
                    System.out.println("Returned");
                    return false;
                }
            }
        }

        return hash.contains(word);
    }

    private int Hash(char[] word, int HASH_SIZE) {
        if (word == null || word.length == 0) {
            return -1;
        }

        long hashSum = 0;
        for (int i = 0; i < word.length; i++) {
            hashSum = 33 * hashSum + word[i];
            hashSum %= HASH_SIZE;
        }

        return (int) hashSum;
    }

    private void T() {

        add("hello");
        contains("hell");
        contains("helloa");
        contains("hello");
        contains("hell");
        contains("helloa");
        boolean contains = contains("hello");
    }

    public static void Test() {
        StandardBloomFilter s = new StandardBloomFilter(10);
        s.T();
    }
}
