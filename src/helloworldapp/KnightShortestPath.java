/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.HashSet;
import java.util.List;

/**
 *
 * @author v-xuzhon
 */
public class KnightShortestPath {
    public int shortestPath(boolean[][] grid, Point source, Point destination) {
        // Write your code here
        return -1;
    }    
    
    private void crawl(boolean[][] grid, int srcX, int srcY, int moveX, int moveY, Point destination, HashSet<PointPath> path) {
        if (srcX < 0 || srcY < 0 || srcX == grid.length || srcY == grid[0].length) {
            return;
        }
        
        if (path.contains(null)) {
            return;
        }
        
        path.add(new PointPath(srcX, srcY, moveX, moveY));
        
        crawl(grid, moveX, moveY, moveX + 1, moveY + 2, destination, path);
        crawl(grid, moveX, moveY, moveX + 1, moveY - 2, destination, path);
        crawl(grid, moveX, moveY, moveX - 1, moveY + 2, destination, path);
        crawl(grid, moveX, moveY, moveX - 1, moveY - 2, destination, path);
        crawl(grid, moveX, moveY, moveX + 2, moveY + 1, destination, path);
        crawl(grid, moveX, moveY, moveX + 2, moveY - 1, destination, path);
        crawl(grid, moveX, moveY, moveX - 2, moveY + 1, destination, path);
        crawl(grid, moveX, moveY, moveX - 2, moveY - 1, destination, path);
        
        path.remove(path.size() - 1);
    }
}
