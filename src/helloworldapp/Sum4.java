/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author v-xuzhon
 */
public class Sum4 {

  public ArrayList<ArrayList<Integer>> fourSum(int[] numbers, int target) {
    /* your code */
    ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();

    if (numbers == null) {
      return results;
    }

    if (numbers.length == 0) {
      results.add(new ArrayList<Integer>());
      return results;
    }

    Arrays.sort(numbers);

    int len = numbers.length;

    for (int outLeft = 0; outLeft < len; outLeft++) {
      if (outLeft != 0 && numbers[outLeft] == numbers[outLeft - 1]) {
        continue;
      }

      for (int outRight = len - 1; outRight > outLeft; outRight--) {
        if (outRight != len - 1 && numbers[outRight] == numbers[outRight + 1]) {
          continue;
        }

        int tgt = target - numbers[outLeft] - numbers[outRight];

        for (int left = outLeft + 1; left < outRight; left++) {
          if ((left != outLeft + 1) && numbers[left] == numbers[left - 1]) {
            continue;
          }

          for (int right = outRight - 1; right > left; right--) {
            if ((right != outRight - 1) && numbers[right] == numbers[right + 1]) {
              continue;
            }

            if (numbers[left] + numbers[right] == tgt) {
              ArrayList<Integer> list = new ArrayList<Integer>();
              list.add(numbers[outLeft]);
              list.add(numbers[left]);
              list.add(numbers[right]);
              list.add(numbers[outRight]);
              results.add(list);
            }
          }
        }
      }
    }

    return results;
  }
}
