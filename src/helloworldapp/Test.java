/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author v-xuzhon
 */
public class Test {

  class Pair {

    public int x, y, val;

    public Pair(int x, int y, int val) {
      this.x = x;
      this.y = y;
      this.val = val;
    }
  }

//  class PairComparator implements Comparator<Pair> {
//
//    public int compare(Pair a, Pair b) {
//      return a.val - b.val;
//    }
//  }
  public int kthSmallest(int[][] matrix, int k) {
    // write your code here
    int[] dx = new int[]{0, 1};
    int[] dy = new int[]{1, 0};
    int n = matrix.length;
    int m = matrix[0].length;
    boolean[][] hash = new boolean[n][m];
//    PriorityQueue<Pair> minHeap = new PriorityQueue<Pair>(k, new PairComparator());
//    PriorityQueue<Pair> minHeap = new PriorityQueue<Pair>(k, new Comparator<Pair>() {
//      public int compare(Pair a, Pair b) {
//        return a.val - b.val;
//      }
//    });

    PriorityQueue<Pair> minHeap = new PriorityQueue<>(k, (Pair a, Pair b) -> a.val - b.val);
    minHeap.add(new Pair(0, 0, matrix[0][0]));

    int cnt = 0;
    for (int i = 0; i < k - 1; i++) {
      Pair cur = minHeap.poll();
      for (int j = 0; j < 2; j++) {
        cnt++;
        System.out.println(cnt);
        System.out.println(minHeap.size());
        System.out.println("==============");
        int next_x = cur.x + dx[j];
        int next_y = cur.y + dy[j];
        Pair next_Pair = new Pair(next_x, next_y, 0);
        if (next_x < n && next_y < m && !hash[next_x][next_y]) {
          hash[next_x][next_y] = true;
          next_Pair.val = matrix[next_x][next_y];
          minHeap.add(next_Pair);
        }
      }
    }
    System.out.println(minHeap.size());
    return minHeap.peek().val;
  }
}
