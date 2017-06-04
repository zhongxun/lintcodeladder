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
public class BigIntegermultiplication {

  public String multiply(String num1, String num2) {
    // Write your code here
    int m = num1.length();
    int n = num2.length();
    List<StringBuilder> multi = new ArrayList<StringBuilder>();

    for (int i = m - 1; i >= 0; i--) {
      int n1 = num1.charAt(i) - '0';
      int carry = 0;
      StringBuilder sb = new StringBuilder();

      for (int j = m - 1; j > i; j--) {
        sb.append('0');
      }

      for (int k = n - 1; k >= 0; k--) {
        int n2 = num2.charAt(k) - '0';
        int sum = n1 * n2 + carry;
        sb.append(sum % 10);
        carry = sum / 10;
      }

      if (carry != 0) {
        sb.append(carry);
      }

      multi.add(sb);
    }

    StringBuilder res = new StringBuilder();
    int max = 0;

    for (StringBuilder sb : multi) {
      max = Math.max(max, sb.length());
    }

    int carry = 0;

    for (int i = 0; i < max; i++) {
      int sum = 0;

      for (StringBuilder sb : multi) {
        if (i < sb.length()) {
          sum += sb.charAt(i) - '0' + carry;
        }
      }

      res.append(sum % 10);
      carry = sum / 10;
    }

    if (carry != 0) {
      res.append(carry);
    }

    return res.reverse().toString();
  }
}
