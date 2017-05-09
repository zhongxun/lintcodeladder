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
public class PalindromePartitioning2 {

//  List<List<String>> results;
//  boolean[][] isPalindrome;
  /**
   * @param s: A string
   * @return: A list of lists of string
   */
  public List<List<String>> partition(String s) {
    List<List<String>> results = new ArrayList<>();
    if (s == null || s.length() == 0) {
      return results;
    }

    boolean[][] isPalindrome = getIsPalindrome(s);

    partition(s, isPalindrome, 0, new ArrayList<Integer>(), results);

    return results;
  }

  private boolean[][] getIsPalindrome(String s) {
    int n = s.length();
    boolean[][] isPalindrome = new boolean[n][n];

    for (int i = 0; i < n; i++) {
      isPalindrome[i][i] = true;
    }
    for (int i = 0; i < n - 1; i++) {
      isPalindrome[i][i + 1] = (s.charAt(i) == s.charAt(i + 1));
    }

    for (int i = n - 3; i >= 0; i--) {
      for (int j = i + 2; j < n; j++) {
        isPalindrome[i][j] = isPalindrome[i + 1][j - 1] && s.charAt(i) == s.charAt(j);
      }
    }

    return isPalindrome;
  }

  private void partition(String s,
          boolean[][] isPalindrome,
          int startIndex,
          List<Integer> partition,
          List<List<String>> results) {
    if (startIndex == s.length()) {
      addResult(s, partition, results);
      return;
    }

    for (int i = startIndex; i < s.length(); i++) {
      if (!isPalindrome[startIndex][i]) {
        continue;
      }
      partition.add(i);
      partition(s, isPalindrome, i + 1, partition, results);
      partition.remove(partition.size() - 1);
    }
  }

  private void addResult(String s, List<Integer> partition, List<List<String>> results) {
    List<String> result = new ArrayList<>();
    int startIndex = 0;
    for (int i = 0; i < partition.size(); i++) {
      result.add(s.substring(startIndex, partition.get(i) + 1));
      startIndex = partition.get(i) + 1;
    }
    results.add(result);
  }
}
