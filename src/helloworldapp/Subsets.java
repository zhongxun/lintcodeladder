/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author v-xuzhon
 */
public class Subsets {
  public int g = 0;
  public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
    ArrayList<ArrayList<Integer>> results = new ArrayList<>();

    if (nums == null) {
      return results;
    }

    if (nums.length == 0) {
      results.add(new ArrayList<Integer>());
      return results;
    }

    Arrays.sort(nums);
    helper(new ArrayList<Integer>(), nums, 0, results);
    
//    System.out.println(g);
    return results;
  }

  // 递归三要素
  // 1. 递归的定义：在 Nums 中找到所有以 subset 开头的的集合，并放到 results
  private void helper(ArrayList<Integer> subset,
          int[] nums,
          int startIndex,
          ArrayList<ArrayList<Integer>> results) {
    // 2. 递归的拆解
    // deep copy
    // results.add(subset);
    results.add(new ArrayList<Integer>(subset));

    for (int i = startIndex; i < nums.length; i++) {
      // [1] -> [1,2]
      subset.add(nums[i]);
      // 寻找所有以 [1,2] 开头的集合，并扔到 results
      g++;
      helper(subset, nums, i + 1, results);
      // [1,2] -> [1]  回溯
      subset.remove(subset.size() - 1);
    }

    // 3. 递归的出口
    // return;
  }

  public ArrayList<ArrayList<Integer>> subsetsIterate(int[] S) {
    Arrays.sort(S);
    int totalNumber = 1 << S.length;
    ArrayList<ArrayList<Integer>> collection = new ArrayList<ArrayList<Integer>>(totalNumber);
    for (int i = 0; i < totalNumber; i++) {
      ArrayList<Integer> set = new ArrayList<Integer>();
      for (int j = 0; j < S.length; j++) {
        this.g++;
        if ((i & (1 << j)) != 0) {
          set.add(S[j]);
        }
      }
      collection.add(set);
    }
    return collection;
  }
}
