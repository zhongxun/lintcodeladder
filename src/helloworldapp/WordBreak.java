/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author v-xuzhon
 */
public class WordBreak {

  Map<String, Boolean> map = new HashMap<String, Boolean>();

  public boolean wordBreak(String s, Set<String> dict) {
    // write your code here
    if (s == null || dict == null) {
      return false;
    }

    if (s.length() == 0 && dict.size() == 0) {
      return true;
    }

    int len = getMaxWordLength(dict);

    return helper(s, dict, len);
  }

  private boolean helper(String s, Set<String> dict, int len) {
    if (dict.contains(s)) {
      return true;
    }

    if (map.containsKey(s)) {
      return map.get(s);
    }

    for (int i = 0; i < s.length(); i++) {
      if (i >= len) {
        break;
      }
      String word = s.substring(0, i + 1);

      if (!dict.contains(word)) {
        continue;
      }

      boolean r = helper(s.substring(i + 1), dict, len);
      map.put(s.substring(i + 1), r);
      return r;
    }

    //map.put(s, Boolean.FALSE);
    return false;
  }

  private int getMaxWordLength(Set<String> dict) {
    int max = 0;
    for (String s : dict) {
      max = Math.max(s.length(), max);
    }

    return max;
  }
}
