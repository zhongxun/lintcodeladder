/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author v-xuzhon
 */
public class PalindromePartitioning {

  public List<List<String>> partition(String s) {
    List<List<String>> results = new ArrayList<List<String>>();

    if (s == null || s.length() == 0) {
      return results;
    }

    List<String> list = new ArrayList<String>();

    if (s.length() == 1) {
      list.add(s);
      results.add(new ArrayList<String>(list));
      return results;
    }

    partition(s, 0, list, results);

    return results;
  }

  private void partition(String s, int begin, List<String> list, List<List<String>> results) {
    if (begin >= s.length()) {
      results.add(new ArrayList<String>(list));
      return;
    }

    for (int i = begin; i < s.length(); i++) {
      String sub = s.substring(begin, i + 1);
      if (!isPalindrome(sub)) {
        continue;
      }

      list.add(sub);
      partition(s, i + 1, list, results);
      list.remove(list.size() - 1);
    }
  }

  private boolean isPalindrome(String s) {

    for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
    }

    return true;
  }

}
