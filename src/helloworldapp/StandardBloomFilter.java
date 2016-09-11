/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/**
 *
 * @author v-xuzhon
 */
public class StandardBloomFilter {

    class HashFunction {

        private int cap;
        private int seed;

        public HashFunction(int cap, int seed) {
            this.cap = cap;
            this.seed = seed;
        }

        public int hash(String word) {
            long sum = 0;
            for (char c : word.toCharArray()) {
                sum += sum * this.seed + c;
                sum %= this.cap;
            }

            return (int) sum;
        }
    }

    private final BitSet bits;
    private final int k;
    private final List<HashFunction> hashFunc;

    public StandardBloomFilter(int k) {
        // initialize your data structure here
        this.k = k;
        hashFunc = new ArrayList<HashFunction>();
        for (int i = 0; i < k; i++) {
            hashFunc.add(new HashFunction(100000 + i, 2 * i + 3));
        }

        bits = new BitSet(100000 + k);
    }

    public void add(String word) {
        // Write your code here
        for (int i = 0; i < k; i++) {
            int position = hashFunc.get(i).hash(word);
            bits.set(position);
        }
    }

    public boolean contains(String word) {
        // Write your code here
        for (int i = 0; i < k; i++) {
            int position = hashFunc.get(i).hash(word);
            if (!bits.get(position)) {
                return false;
            }
        }

        return true;
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
