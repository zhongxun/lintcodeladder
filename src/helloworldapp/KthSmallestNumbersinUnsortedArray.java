/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author v-xuzhon
 */
public class KthSmallestNumbersinUnsortedArray {

//    class PQSort implements Comparator<Integer> {
//
//        @Override
//        public int compare(Integer one, Integer two) {
//            return two - one;
//        }
//    }

    public int kthSmallest(int k, int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0) {
            return Integer.MIN_VALUE;
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>()
        {
            public int compare(Integer one, Integer two) {
                return two - one;
            }
        });
        
        for (Integer num : nums) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        return maxHeap.peek();
    }
}
