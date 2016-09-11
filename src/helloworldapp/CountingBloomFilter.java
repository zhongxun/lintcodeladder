/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author v-xuzhon
 */
public class CountingBloomFilter {

    class HashFunction {

        int seed;
        int cap;

        public HashFunction(int cap, int seed) {
            this.cap = cap;
            this.seed = seed;            
        }

        public int hash(String word) {
            int ret = 0;
            for (int i = 0; i < word.length(); i++) {
                ret = ret * this.seed + word.charAt(i);
                ret %= this.cap;
            }

            return ret;
        }
    }

    private int k;
    private int[] bits;
    private List<HashFunction> hashFunctions;

    public CountingBloomFilter(int k) {
        // initialize your data structure here
        this.k = k;
        this.bits = new int[100000 + k];
        this.hashFunctions = new ArrayList<HashFunction>();
        for (int i = 0; i < this.k; i++) {
            this.hashFunctions.add(new HashFunction(100000 + i, 2 * i + 3));
        }
    }

    public void add(String word) {
        // Write your code here
        for (HashFunction hashFunction : hashFunctions) {
            int position = hashFunction.hash(word);
            bits[position] += 1;
        }
    }

    public void remove(String word) {
        // Write your code here
        for (HashFunction hashFunction : hashFunctions) {
            int position = hashFunction.hash(word);
            bits[position] -= 1;
        }
    }

    public boolean contains(String word) {
        // Write your code here
        for (HashFunction hashFunction : hashFunctions) {
            int position = hashFunction.hash(word);
            if (bits[position] <= 0) {
                return false;
            }
        }

        return true;
    }
}
