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
public class WildcardMatching {

  public boolean isMatch(String s, String p) {
    // write your code here
    int pS = 0, pP = 0, match = 0, starIdx = -1;
    while (pS < s.length()) {
      // advancing both pointers
      if (pP < p.length() && (p.charAt(pP) == '?' || s.charAt(pS) == p.charAt(pP))) {
        pS++;
        pP++;
      } // * found, only advancing pattern pointer
      else if (pP < p.length() && p.charAt(pP) == '*') {
        starIdx = pP;
        match = pS;
        pP++;
      } // last pattern pointer was *, advancing string pointer
      else if (starIdx != -1) {
        pP = starIdx + 1;
        match++;
        pS = match;
      } //current pattern pointer is not star, last patter pointer was not *
      //characters do not match
      else {
        return false;
      }
    }

    //check for remaining characters in pattern
    while (pP < p.length() && p.charAt(pP) == '*') {
      pP++;
    }

    return pP == p.length();
  }
}
