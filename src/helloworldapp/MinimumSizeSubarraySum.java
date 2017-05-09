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
public class MinimumSizeSubarraySum {

  public int minimumSize(int[] nums, int s) {
    // write your code here
    if (nums == null || nums.length == 0) {
        return -1;
    }
    
    int len = nums.length;
    int min = len;

    int[] sum = new int[len + 1];
    sum[0] = 0;

    for (int i = 1; i <= len; i++) {
      sum[i] = sum[i - 1] + nums[i - 1];
    }

    boolean hasFound = false;
    for (int i = 0; i <= len; i++) {
      if (sum[i] < s) {
        continue;
      }

      for (int j = 0; j <= i; j++) {
        if (sum[i] - sum[j] < s) {
          break;
        }

        if (i - j <= min) {
          min = i - j;
          hasFound = true;
        }
      }
    }

    return hasFound ? min : -1;
  }
}
