/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author v-xuzhon
 */
public class LongestPalindromicSubstring {

  public String longestPalindrome(String s) {
    // Write your code here
    if (s == null || s.length() < 2) {
      return s;
    }

    int len = s.length();
    String max = "";
    for (int i = 0; i < len; i++) {
      for (int j = i; j < len; j++) {
        if (!isPalindrome(s, i, j)) {
          continue;
        }

        if (j - i + 1 > max.length()) {
          max = s.substring(i, j + 1);
        }
      }
    }

    return max;
  }

  private boolean isPalindrome(String s, int i, int j) {
    while (i < j) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }

    return true;
  }

  public String longestPalindrome2(String s) {
    // Write your code here
    if (s == null || s.length() < 2) {
      return s;
    }

    String result = "";

    int max = 0;
    int len = s.length();

    for (int i = 1; i < 2 * len; i++) {
      int count = 1;
      while (i - count >= 0 && i + count <= 2 * len && get(s, i - count) == get(s, i + count)) {
        count++;
      }

      count--;

      if (count > max) {
        result = s.substring((i - count) / 2, (i + count) / 2);
        max = count;
      }
    }

    return result;
  }

  private char get(String s, int i) {
    if (i % 2 == 0) {
      return '#';
    } else {
      return s.charAt(i / 2);
    }
  }
}
