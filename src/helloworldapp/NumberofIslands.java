/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author v-xuzhon
 *
 *
 * [
 * [1,1,0,0,0], 
 * [0,1,0,0,1], 
 * [0,0,0,1,1], 
 * [0,0,0,0,0], 
 * [0,0,0,0,1] 
 * ]
 */
public class NumberofIslands {

  class Coordinate {

    int x;
    int y;

    public Coordinate(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  public int numIslands(boolean[][] grid) {
    // Write your code here
    if (grid == null || grid.length == 0 || grid[0].length == 0) {
      return 0;
    }

    int cnt = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j]) {
          travel(grid, new Coordinate(i, j));
          cnt++;
        }
      }
    }

    return cnt;
  }

  private void travel(boolean[][] grid, Coordinate coor) {
    int[] deltaX = {1, -1, 0, 0};
    int[] deltaY = {0, 0, 1, -1};

    Queue<Coordinate> queue = new LinkedList<Coordinate>();
    queue.offer(coor);
    while (!queue.isEmpty()) {
      Coordinate curt = queue.poll();

      for (int i = 0; i < 4; i++) {
        Coordinate next = new Coordinate(curt.x + deltaX[i], curt.y + deltaY[i]);

        if (!inBound(grid, next)) {
          continue;
        }

        if (grid[next.x][next.y]) {
          grid[next.x][next.y] = false;
          queue.offer(next);
        }
      }
    }
  }

  private boolean inBound(boolean[][] grid, Coordinate coor) {
    if (coor.x < 0 || coor.x >= grid.length) {
      return false;
    }

    if (coor.y < 0 || coor.y >= grid[0].length) {
      return false;
    }

    return grid[coor.x][coor.y];
  }
}
