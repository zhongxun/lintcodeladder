package helloworldapp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BuildPostOfficeII {
    /**
     * @param grid a 2D grid
     * @return an integer
     */
    
     
    static final int EMPTY = 0;
    static final int HOUSE = 1;
    static final int WALL = 2;
    int[] deltaX = {1, -1, 0, 0};
    int[] deltaY = {0, 0, 1, -1};
    
    int n = 0;
    int m = 0;
    int[][] grid;
    public int shortestDistance(int[][] grid) {
        // Write your code here
        if (grid == null || grid.length == 0 || grid[0].length ==0) {
          return -1;
        }
        
        setGrid(grid);
        
        List<Coordinate> houses = getCoordinate(HOUSE);
        int[][] visitedTimes = new int[n][m];
        int[][] distanceSum = new int[n][m];
        
        for(Coordinate house : houses) {
          travel(house, visitedTimes, distanceSum);
        }
        
        List<Coordinate> empties = getCoordinate(EMPTY);
        
        int shortest = Integer.MAX_VALUE;
        
        for(Coordinate curt : empties) {
          if (visitedTimes[curt.x][curt.y] != houses.size()) {
            continue;
          }
          
          shortest = Math.min(shortest, distanceSum[curt.x][curt.y]);
        }
        
        if (shortest == Integer.MAX_VALUE) {
          return -1;
        }
        
        return shortest;
    }
    
    private void setGrid(int[][] grid) {
      this.n = grid.length;
      this.m = grid[0].length;
      this.grid = grid;
    }
    
    private List<Coordinate> getCoordinate(int type) {
      List<Coordinate> coordinates = new ArrayList<Coordinate>();
      
      for (int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
          if (this.grid[i][j] == type) {
            coordinates.add(new Coordinate(i, j));
          }
        }
      }
      
      return coordinates;
    }
    
    private boolean inBound(Coordinate point) {
      if (point.x < 0 || point.x >= n) {
        return false;
      }
      
      if (point.y < 0 || point.y >= m) {
        return false;
      }
      
      return (this.grid[point.x][point.y] == EMPTY && this.grid[point.x][point.y] != WALL);
    }
    
    private void travel(Coordinate point, int[][] visitedTimes, int[][] distanceSum) {
      boolean[][] hash = new boolean[n][m];
      Queue<Coordinate> queue = new LinkedList<Coordinate>();
      queue.offer(point);
      hash[point.x][point.y] = true;
      int steps = 0;
      
      while(!queue.isEmpty()) {
        int size = queue.size();
        steps++;
        for (int i = 0; i < size; i++) {
          Coordinate curt = queue.poll();
          for (int j = 0; j < 4; j++) {
            int nextX = curt.x + deltaX[j];
            int nextY = curt.y + deltaY[j];
            Coordinate next = new Coordinate(nextX, nextY);
            
            if (!inBound(next)) {
              continue;
            }
            
            if (hash[nextX][nextY]) {
              continue;
            }
            
            queue.offer(next);
            hash[nextX][nextY] = true;
            visitedTimes[nextX][nextY]++;
            distanceSum[nextX][nextY]+=steps;
          }          
        }
      }
    }
}