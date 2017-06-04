/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;

/**
 *
 * @author v-xuzhon
 */
public class GenerateParentheses {

  public ArrayList<String> generateParenthesis(int n) {
    // Write your code here
    ArrayList<String> result = new ArrayList<String>();

    if (n <= 0) {
      return result;
    }

    helper("", n, n, result);

    return result;
  }

  private void helper(String paren, int left, int right, ArrayList<String> result) {
    if (left == 0 && right == 0) {
      System.out.println("add " + paren);
      result.add(paren);
      return;
    }

    if (left > 0) {
      System.out.println("before left " + paren);
      helper(paren + "(", left - 1, right, result);
    }

    if (right > 0 && left < right) {
      System.out.println("before right " + paren);
      helper(paren + ")", left, right - 1, result);
    }
  }
}
