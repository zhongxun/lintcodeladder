/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author v-xuzhon
 */
public class RemoveSubstrings {

    public int minLength(String s, Set<String> dict) {
        // Write your code here
        if (s == null || s.length() == 0) {
          return 0;
        }
        
        int min = s.length();
        
        if (dict == null || dict.size() == 0) {
          return min;
        }
        
        Queue<String> queue = new LinkedList<String>();
        Set<String> hash = new HashSet<String>();
        
        queue.offer(s);
        hash.add(s);
        
        while(!queue.isEmpty()){
          String str = queue.poll();
          
          for (String sub : dict) {
            int found = str.indexOf(sub);
            
            while (found != -1) {
              String next = str.substring(0, found) + str.substring(found + sub.length(), str.length());
              
              if (!hash.contains(next)) {
                queue.offer(next);
                hash.add(next);
                min = Math.min(min, next.length());
              }
              
              found = str.indexOf(sub, found + 1);
            }
          }
        }
        
        return min;
    }
}
