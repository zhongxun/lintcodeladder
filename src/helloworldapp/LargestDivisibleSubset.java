/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author v-xuzhon
 */
public class LargestDivisibleSubset {

  public List<Integer> largestDivisibleSubset(int[] nums) {
    List<Integer> ans = new ArrayList<Integer>();
    if (nums == null || nums.length == 0) {
      return ans;
    }

    Arrays.sort(nums);
    int[] f = new int[nums.length];
    int[] pre = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      f[i] = 1;
      pre[i] = i;
      for (int j = 0; j < i; j++) {
        if (nums[i] % nums[j] == 0 && f[i] < f[j] + 1) {
          f[i] = f[j] + 1;
          pre[i] = j;
        }
      }
    }

    int max = 0;
    int max_i = 0;

    for (int i = 0; i < nums.length; i++) {
      if (f[i] > max) {
        max = f[i];
        max_i = i;
      }
    }

    ans.add(nums[max_i]);

    while (max_i != pre[max_i]) {
      max_i = pre[max_i];
      ans.add(nums[max_i]);
    }

    Collections.reverse(ans);
    return ans;
  }

  public int sqrt(int n) {
    int start = 0;
    int end = n;

    while (start + 1 < end) {
      int mid = start + (end - start) / 2;
      if (mid * mid > n) {
        end = mid;
      } else {
        start = mid;
      }
    }

    return start;
  }
}
