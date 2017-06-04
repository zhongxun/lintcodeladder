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
public class ScrambleString {

  public boolean isScramble(String s1, String s2) {
    // Write your code here
    if (s1 == null) {
      return false;
    }

    if (s2 == null) {
      return false;
    }

    if (s1.length() != s2.length()) {
      return false;
    }

    return isScramble(1, s1, s2);
  }

  private boolean isScramble(int index, String s1, String s2) {
    if (s1.length() == 1) {
      return s1.equals(s2);
    }
    
    for (int i = index; i < s1.length(); i++) {
      String leftS1 = s1.substring(0, i);
      String leftS2 = s2.substring(0, i);
      if ((new StringBuilder(leftS1)).reverse().toString().equals(leftS2)) {
        return true;
      }

      if (isScramble(1, leftS1, leftS2)) {
        return true;
      }

      String rightS1 = s1.substring(i);
      String rightS2 = s2.substring(i);

      if ((new StringBuilder(rightS1)).reverse().toString().equals(rightS2)) {
        return true;
      }

      if (isScramble(1, rightS1, rightS2)) {
        return true;
      }

      // String rightS1
      // if (.reverse().equals()) {
      //     return true;
      // }
      // if (isScramble(i + 1, s1.substring(i), s2.substring(i))) {
      //     return true;
      // }
    }

    return false;
  }
}
