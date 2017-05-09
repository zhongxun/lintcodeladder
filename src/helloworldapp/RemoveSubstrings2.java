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
public class RemoveSubstrings2 {
    public int minLength(String s, Set<String> dict) {
        // Write your code here
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int min = s.length();
        
        if (dict == null || dict.size() == 0) {
            return min;
        }
        
        int maxWordLen = getMaxWordLen(dict);
        
        Queue<String> queue = new LinkedList<String>();
        Set<String> hash = new HashSet<String>();
        queue.offer(s);
        hash.add(s);
        
        while (!queue.isEmpty()) {
            String str = queue.poll();
            if (str.length() < min) {
                min = str.length();
            }
            
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j < i + maxWordLen + 1 && j < str.length(); j++) {
                    String remove = str.substring(i, j);
                    if (!dict.contains(remove)) {
                        continue;
                    }
                    
                    String next = str.substring(0, i) + str.substring(j, str.length());
                    if (hash.contains(next)) {
                        continue;
                    }
                    
                    hash.add(next);
                    queue.offer(next);
                }
            }
        }
        
        return min;
    }
    
    private int getMaxWordLen(Set<String> dict) {
        int max = 0;
        
        for (String word : dict) {
            max = Math.max(max, word.length());
        }
        
        return max;
    }  
}
