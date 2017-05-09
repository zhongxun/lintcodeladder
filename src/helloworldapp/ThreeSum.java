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
public class ThreeSum {
//    public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
//        // write your code here
//        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
//        
//        if (numbers == null || numbers.length == 0) {
//          return res;
//        }
//        
//        Arrays.sort(numbers);
//        helper(numbers, 0, 0, new ArrayList<Integer>(), res);
//        
//        return res;
//    }
//    
//    private void helper(int[] numbers, int start, int target, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> res) {
//      if (start > numbers.length) {
//        return;
//      }
//      
//      if (target == 0 && path.size() == 3) {
//        res.add(new ArrayList<Integer>(path));
//        return;
//      }
//      
//      for (int i = start; i < numbers.length; i++) {
//        path.add(numbers[i]);
//        helper(numbers, i + 1, target - numbers[i], path, res);
//        path.remove(path.size() - 1);
//      }
//    }  

  public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

    if (numbers == null || numbers.length == 0) {
      return res;
    }

    Arrays.sort(numbers);

    helper(numbers, 0, new ArrayList<Integer>(), res);

    return res;
  }

  private void helper(int[] numbers, int target, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> res) {

    for (int i = 0; i < numbers.length; i++) {
      if (i != 0 && numbers[i] == numbers[i - 1]) {
        continue;
      }

      helper2(numbers, i, i + 1, target - numbers[i], res);
    }
  }

  private void helper2(int[] numbers, int n1, int n2, int target, ArrayList<ArrayList<Integer>> res) {
    int n3 = numbers.length - 1;

    while (n2 < n3) {

      if (numbers[n2] + numbers[n3] == target) {
        ArrayList<Integer> path = new ArrayList<Integer>();
        path.add(numbers[n1]);
        path.add(numbers[n2]);
        path.add(numbers[n3]);
        res.add(new ArrayList<Integer>(path));

        n2++;
        n3--;

        while (n2 < n3 && n2 + 1 < numbers.length && numbers[n2] == numbers[n2 - 1]) {
          n2++;
        }

        while (n2 < n3 && n3 - 1 >= 0 && numbers[n3] == numbers[n3 - 1]) {
          n3--;
        }
        // return result
      } else if (numbers[n2] + numbers[n3] > target) {
        n3--;
      } else {
        n2++;
      }
    }
  }
}
