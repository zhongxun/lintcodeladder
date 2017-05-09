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
 */
public class ZombieInMatrix {
    static final int PEOPLE = 0;
    static final int ZOMBIE = 1;
    static final int WALL = 2;
    
    int[] deltaX = {1, -1, 0, 0};
    int[] deltaY = {0, 0, 1, -1};

    public int zombie(int[][] grid) {
        // Write your code here
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return -1;
        }

        Queue<Point> queue = new LinkedList<Point>();
        int people = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == ZOMBIE) {
                    queue.offer(new Point(i, j));
                } else if (grid[i][j] == PEOPLE) {
                    people++;
                }
            }
        }
        
        // Corner case
        if (people == 0) {
            return 0;
        }

        int days = 0;

        while (!queue.isEmpty()) {
            days++;
            int size = queue.size();           

            for (int i = 0; i < size; i++) {
                Point curt = queue.poll();

                for (int m = 0; m < 4; m++) {
                    Point nextStep = new Point(curt.x + deltaX[m], curt.y + deltaY[m]);
                    if (!canTurn(nextStep, grid)) {
                        continue;
                    }

                    people--;
                    if (people == 0) {
                        return days;
                    }

                    grid[nextStep.x][nextStep.y] = ZOMBIE;
                    queue.offer(nextStep);
                }
            }
        }

        return -1;
    }

    private boolean canTurn(Point point, int[][] grid) {
        if (point.x < 0 || point.x >= grid.length) {

            return false;
        }

        if (point.y < 0 || point.y >= grid[0].length) {
            return false;
        }

        return !(grid[point.x][point.y] == WALL || grid[point.x][point.y] == ZOMBIE);
    }
}
