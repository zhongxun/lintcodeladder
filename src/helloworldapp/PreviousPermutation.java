/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;

/**
 *
 * @author v-xuzhon
 */
public class PreviousPermutation {

  public void swapItem(ArrayList<Integer> nums, int i, int j) {
    Integer tmp = nums.get(i);
    nums.set(i, nums.get(j));
    nums.set(j, tmp);
  }

  public void swapList(ArrayList<Integer> nums, int i, int j) {
    while (i < j) {
      swapItem(nums, i, j);
      i++;
      j--;
    }
  }
//

  public ArrayList<Integer> previousPermuation(ArrayList<Integer> nums) {
    int len = nums.size();
    if (len <= 1) {
      return nums;
    }
    int i = len - 1;
    while (i > 0 && nums.get(i) >= nums.get(i - 1)) {
      i--;
    }
    swapList(nums, i, len - 1);
    if (i != 0) {
      int j = i;
      while (nums.get(j) >= nums.get(i - 1)) {
        j++;
      }
      swapItem(nums, j, i - 1);
    }

    return nums;
  }
  public ArrayList<Integer> previousPermuation2(ArrayList<Integer> nums) {
    // write your code
    int len = nums.size();
    if (len <= 1) {
      return nums;
    }
    int i = len - 1;
    while (i > 0 && nums.get(i) > nums.get(i - 1)) {
      i--;
    }

    swapList(nums, i, len - 1);
    if (i != 0) {
      int j = i;
      while (nums.get(j) >= nums.get(i - 1)) {
        j++;
      }

      swapItem(nums, j, i - 1);
    }

    return nums;
  }

//  private void swapItem(ArrayList<Integer> nums, int a, int b) {
//    Integer tmp = nums.get(a);
//    nums.set(a, nums.get(b));
//    nums.set(b, tmp);
//  }
//
//  private void swapList(ArrayList<Integer> nums, int begin, int end) {
//    while (begin < end) {
//      swapItem(nums, begin, end);
//      begin++;
//      end--;
//    }
//  }
}
