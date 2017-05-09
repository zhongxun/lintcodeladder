/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author v-xuzhon
 */
public class WordLadder {

  public int ladderLength(String start, String end, Set<String> dict) {
    if (dict == null || dict.size() == 0) {
      return 0;
    }
    
    HashSet<String> hash = new HashSet<String>();
    Queue<String> queue = new LinkedList<String>();
    dict.add(start);
    dict.add(end);
    
    queue.offer(start);
    hash.add(start);
    
    int len = 1;
    while(!queue.isEmpty()) {
      int size = queue.size();
      len++;
      for (int i = 0; i < size; i++) {
        String word = queue.poll();
        for (String next : getNextWords(dict, word)) {
          if (next.equals(end)) {
            return len;
          }
          
          if (hash.contains(next)){
            continue;
          }
          
          queue.offer(next);
          hash.add(next);
        }
      }
    }
    
    return 0;
  }

  private List<String> getNextWords(Set<String> dict, String word) {
    List<String> result = new ArrayList<String>();
    
    for (int i = 0; i < word.length(); i++) {
      for (char c = 'a'; c <= 'z'; c++) {
        if (c == word.charAt(i)) {
          continue;
        }
        
        String next = replace(word, i, c);
        if (dict.contains(next)) {
          result.add(next);
        }
      }
    }
    
    return result;
  }

  private String replace(String word, int index, char c) {
    char[] chars = word.toCharArray();
    chars[index] = c;
    
    return new String(chars);
  }
}
