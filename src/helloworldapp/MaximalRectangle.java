/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.Stack;

/**
 *
 * @author v-xuzhon
 */
public class MaximalRectangle {

  public int maximalRectangle(boolean[][] matrix) {
    // Write your code here
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return 0;
    }
    
    int m = matrix.length;
//    int n = m == 0 ? 0 : matrix[0].length;
    int n = matrix[0].length;
//    int[][] height = new int[m][n + 1];
    int[][] height = new int[m][n];

    int maxArea = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (!matrix[i][j]) {
          height[i][j] = 0;
        } else {
          height[i][j] = i == 0 ? 1 : height[i - 1][j] + 1;
        }
      }
    }
    
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {        
        System.out.print(height[i][j]);
        System.out.print(',');
      }
      System.out.println();
    }
    
    /*
1,1,0,0,1,
0,2,0,0,2,
0,0,1,1,3,
0,0,2,2,4,
0,0,0,0,5,
    */
    
    for (int i = 0; i < m; i++) {
      int area = maxAreaInHist(height[i]);
      if (area > maxArea) {
        maxArea = area;
      }
    }

    return maxArea;
  }

  private int maxAreaInHist(int[] height) {
    Stack<Integer> stack = new Stack<Integer>();

    int i = 0;
    int max = 0;

    while (i < height.length) {
      if (stack.isEmpty() || height[stack.peek()] <= height[i]) {
        stack.push(i++);
      } else {
        int t = stack.pop();
        max = Math.max(max, height[t] * (stack.isEmpty() ? i : i - stack.peek() - 1));
      }
    }
    return max;
  }
}
