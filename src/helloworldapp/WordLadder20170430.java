/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author v-xuzhon
 */
public class WordLadder20170430 {

  public int ladderLength(String start, String end, Set<String> dict) {
    // write your code here
    if (start == null || start.length() == 0) {
      return 0;
    }

    if (end == null || end.length() == 0) {
      return 0;
    }

    if (dict == null || dict.size() == 0) {
      return 0;
    }

    int step = 1;

    Map<String, List<String>> map = new HashMap<String, List<String>>();
    dict.add(start);
    dict.add(end);
    Queue<String> queue = new LinkedList<String>();
    queue.add(start);

    while (!queue.isEmpty()) {
      int size = queue.size();

      for (int i = 0; i < size; i++) {
        String word = queue.poll();
        step++;
        for (String adj : getAdjWords(dict, word)) {
          if (end.equals(adj)) {
            return step;
          }

          if (!map.containsKey(word)) {
            map.put(word, new ArrayList<String>());
          }

          map.get(word).add(adj);
          queue.add(adj);
        }
      }
    }

    return 0;
  }

  private List<String> getAdjWords(Set<String> dict, String word) {
    List<String> words = new ArrayList<String>();

    for (char c = 'a'; c <= 'z'; c++) {
      for (int i = 0; i < word.length(); i++) {
        if (word.charAt(i) == c) {
          continue;
        }

        String adj = word.substring(0, i) + String.valueOf(c) + word.substring(i + 1);

        if (!dict.contains(adj)) {
          continue;
        }

        words.add(adj);
      }
    }
    return words;
  }
  
// public int ladderLength(String start, String end, Set<String> dict) {
//        if (dict == null) {
//            return 0;
//        }
//
//        if (start.equals(end)) {
//            return 1;
//        }
//        
//        dict.add(start);
//        dict.add(end);
//
//        HashSet<String> hash = new HashSet<String>();
//        Queue<String> queue = new LinkedList<String>();
//        queue.offer(start);
//        hash.add(start);
//        
//        int length = 1;
//        while(!queue.isEmpty()) {
//            length++;
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                String word = queue.poll();
//                for (String nextWord: getNextWords(word, dict)) {
//                    if (hash.contains(nextWord)) {
//                        continue;
//                    }
//                    if (nextWord.equals(end)) {
//                        return length;
//                    }
//                    
//                    hash.add(nextWord);
//                    queue.offer(nextWord);
//                }
//            }
//        }
//        return 0;
//    }
//
//    // replace character of a string at given index to a given character
//    // return a new string
//    private String replace(String s, int index, char c) {
//        char[] chars = s.toCharArray();
//        chars[index] = c;
//        return new String(chars);
//    }
//    
//    // get connections with given word.
//    // for example, given word = 'hot', dict = {'hot', 'hit', 'hog'}
//    // it will return ['hit', 'hog']
//    private ArrayList<String> getNextWords(String word, Set<String> dict) {
//        ArrayList<String> nextWords = new ArrayList<String>();
//        for (char c = 'a'; c <= 'z'; c++) {
//            for (int i = 0; i < word.length(); i++) {
//                if (c == word.charAt(i)) {
//                    continue;
//                }
//                String nextWord = replace(word, i, c);
//                if (dict.contains(nextWord)) {
//                    nextWords.add(nextWord);
//                }
//            }
//        }
//        return nextWords;
//    }  
}
