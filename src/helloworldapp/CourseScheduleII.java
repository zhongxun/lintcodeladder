/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 *
 * @author v-xuzhon
 */
public class CourseScheduleII {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // Write your code here
        List[] edges = new ArrayList[numCourses];
        int[] degree = new int[numCourses];
        
        for (int i = 0; i < numCourses; i++) {
          edges[i] = new ArrayList<Integer>();          
        }
        
        for (int[] pre : prerequisites) {
          int u = pre[0];
          int v = pre[1];
          degree[u]++;
          edges[v].add(u);
        }
        
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < numCourses; i++) {
          if (degree[i] == 0) {
            queue.offer(i);
          }
        }
        
        int step = 0;
        int[] order = new int[numCourses];
        
        while(!queue.isEmpty()) {
          int curt = (int)queue.poll();
          order[step] = curt;
          step++;
          int size = edges[curt].size();
          
          for (int i = size - 1; i >= 0; i--) {
            int pointer = (int)edges[curt].get(i);
            degree[pointer]--;
            if (degree[pointer] == 0) {
              queue.offer(pointer);
            }
          }          
        }
        
        if (step == numCourses) {
          return order;
        }
        
        return new int[0];
    }
}
