/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author v-xuzhon
 */
public class SpiralMatrix {

  public List<Integer> spiralOrder(int[][] matrix) {
    // Write your code here
    List<Integer> result = new ArrayList<Integer>();
    
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return result;
    }
    
    int t = 0;
    int b = matrix.length - 1;
    int l = 0;
    int r = matrix[0].length - 1;
    int i = 0;
    int j = 0;
    int cnt = 0;
    int total = matrix.length * matrix[0].length;

    while (r >= l && b >= t) {
      for (j = l; j <= r; j++) {
        cnt++;
        result.add(matrix[i][j]);
        if (cnt == total) {
          return result;
        }
      }
      j--;
      t++;
      for (i = t; i <= b; i++) {
        cnt++;
        result.add(matrix[i][j]);
        if (cnt == total) {
          return result;
        }
      }
      i--;
      r--;
      for (j = r; j >= l; j--) {
        cnt++;
        result.add(matrix[i][j]);
        if (cnt == total) {
          return result;
        }
      }
      j++;
      b--;
      for (i = b; i >= t; i--) {
        cnt++;
        result.add(matrix[i][j]);
        if (cnt == total) {
          return result;
        }
      }
      i++;
      l++;
    }

    return result;
  }
}
