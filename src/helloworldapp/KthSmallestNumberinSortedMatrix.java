/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author v-xuzhon
 */
public class KthSmallestNumberinSortedMatrix {

//  public class Pair {
//
//    public int x, y, val;
//
//    public Pair(int x, int y, int val) {
//      this.x = x;
//      this.y = y;
//      this.val = val;
//    }
//  }
//
//  public int kthSmallest(int[][] matrix, int k) {
//    // write your code here
//    int[] dx = new int[]{0, 1};
//    int[] dy = new int[]{1, 0};
//    int n = matrix.length;
//    int m = matrix[0].length;
//    boolean[][] hash = new boolean[n][m];
//
//    PriorityQueue<Pair> minHeap = new PriorityQueue<Pair>(k, new Comparator<Pair>() {
//      public int compare(Pair a, Pair b) {
//        return a.val - b.val;
//      }
//    });
//
//    minHeap.add(new Pair(0, 0, matrix[0][0]));
//
//    for (int i = 0; i < k - 1; i++) {
//      Pair cur = minHeap.poll();
//      for (int j = 0; j < 2; j++) {
//        int next_x = cur.x + dx[j];
//        int next_y = cur.y + dy[j];
//        Pair next_Pair = new Pair(next_x, next_y, 0);
//        if (next_x < n && next_y < m && !hash[next_x][next_y]) {
//          hash[next_x][next_y] = true;
//          next_Pair.val = matrix[next_x][next_y];
//          minHeap.add(next_Pair);
//        }
//      }
//    }
//    return minHeap.peek().val;
//  }
  public int kthSmallest2(int[][] matrix, int k) {
    // write your code here
//    PriorityQueue<Integer> pq = new PriorityQueue<>(k, (Integer a, Integer b) -> b - a);

    Queue<Integer> pq = new PriorityQueue<>(k, (Integer a, Integer b) -> b - a);

//    Queue<Integer> pq = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
//      public int compare(Integer A, Integer B) {
//        return B - A;
//      }
//    });
    for (int[] matrix1 : matrix) {
      for (int j = 0; j < matrix[0].length; j++) {
        pq.offer(matrix1[j]);
        if (pq.size() > k) {
          pq.poll();
        }
      }
    }

    return pq.peek();
  }

  class ResultType {

    public int num;
    public boolean exists;

    public ResultType(boolean e, int n) {
      exists = e;
      num = n;
    }
  }

  private ResultType check(int value, int[][] matrix) {
    int n = matrix.length;
    int m = matrix[0].length;

    boolean exists = false;
    int num = 0;
    int i = n - 1, j = 0;
    while (i >= 0 && j < m) {
      if (matrix[i][j] == value) {
        exists = true;
      }

      if (matrix[i][j] <= value) {
        num += i + 1;
        j += 1;
      } else {
        i -= 1;
      }
    }

    return new ResultType(exists, num);
  }

  public int kthSmallestSearch(int[][] matrix, int k) {
    // write your code here
    int n = matrix.length;
    int m = matrix[0].length;

    int left = matrix[0][0];
    int right = matrix[n - 1][m - 1];

    // left + 1 < right
    while (left <= right) {
      int mid = left + (right - left) / 2;
      ResultType type = check(mid, matrix);
      if (type.exists && type.num == k) {
        return mid;
      } else if (type.num < k) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return left;
  }
}
