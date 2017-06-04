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
public class MajorityNumber {

  public int majorityNumber(ArrayList<Integer> nums) throws Exception {
    if (nums == null || nums.isEmpty()) {
      throw new IllegalArgumentException("test");
    }

    int candidate = nums.get(0);
    int count = 1;

    for (int i = 1; i < nums.size(); i++) {
      if (count == 0) {
        candidate = nums.get(i);
        count = 1;
      } else if (candidate == nums.get(i)) {
        count++;
      } else {
        count--;
      }
    }

    return candidate;
  }
}
