/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author v-xuzhon
 */
public class LongestSubstringwithAtMostKDistinctCharacters {

  public int lengthOfLongestSubstringKDistinct(String s, int k) {
    // write your code here
    int maxLen = 0;

    // Key: letter; value: the number of occurrences.
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    int i, j = 0;
    char c;
    for (i = 0; i < s.length(); i++) {
      while (j < s.length()) {
        c = s.charAt(j);
        if (map.containsKey(c)) {
          map.put(c, map.get(c) + 1);
        } else {
          if (map.size() == k) {
            break;
          }
          map.put(c, 1);
        }
        j++;
      }

      maxLen = Math.max(maxLen, j - i);
      c = s.charAt(i);
      if (map.containsKey(c)) {
        int count = map.get(c);
        if (count > 1) {
          map.put(c, count - 1);
        } else {
          map.remove(c);
        }
      }
    }
    return maxLen;
  }
}
