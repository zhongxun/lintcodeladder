/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author v-xuzhon
 */
public class SlidingWindowMaximum {

  public ArrayList<Integer> maxSlidingWindow(int[] nums, int k) {
    // write your code here
    ArrayList<Integer> result = new ArrayList<Integer>();

    Queue<Integer> pq = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
      public int compare(Integer A, Integer B) {
        return B - A;
      }
    });

    for (int i = 0; i < k; i++) {
      pq.offer(nums[i]);
    }

    result.add(pq.peek());

    for (int i = 1; i <= nums.length - k; i++) {
      pq.remove(nums[i - 1]);
      pq.offer(nums[i + k - 1]);
      result.add(pq.peek());
    }

    return result;
  }

  void inQueue(Deque<Integer> deque, int num) {
    while (!deque.isEmpty() && deque.peekLast() < num) {
      deque.pollLast();
    }
    deque.offer(num);
  }

  void outQueue(Deque<Integer> deque, int num) {
    if (deque.peekFirst() == num) {
      deque.pollFirst();
    }
  }

  public ArrayList<Integer> maxSlidingWindow2(int[] nums, int k) {
    // write your code here
    ArrayList<Integer> ans = new ArrayList<Integer>();
    Deque<Integer> deque = new ArrayDeque<Integer>();
    if (nums.length == 0) {
      return ans;
    }
    for (int i = 0; i < k - 1; i++) {
      inQueue(deque, nums[i]);
    }

    for (int i = k - 1; i < nums.length; i++) {
      inQueue(deque, nums[i]);
      ans.add(deque.peekFirst());
      outQueue(deque, nums[i - k + 1]);
    }
    return ans;

  }
}
