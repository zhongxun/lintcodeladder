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
public class StringToIntegerII {

  public int atoi2(String str) {
    // write your code here
    if (str == null) {
      return 0;
    }

    str = str.trim();

    if (str.length() == 0) {
      return 0;
    }

    boolean isNegative = false;

    int i = 0;
    if (str.charAt(0) == '-') {
      isNegative = true;
      i = 1;
    }

    if (str.charAt(0) == '+') {
      isNegative = false;
      i = 1;
    }

    double result = 0;
    while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
      result = result * 10 + (str.charAt(i) - '0');
      i++;
    }

    if (isNegative) {
      result = -result;
    }

    if (result > Integer.MAX_VALUE) {
      return Integer.MAX_VALUE;
    }

    if (result < Integer.MIN_VALUE) {
      return Integer.MIN_VALUE;
    }

    return (int) result;
  }

  public int atoi(String str) {
    // write your code here
    if (str == null || str.length() < 1) {
      return 0;
    }

    // trim white spaces
    str = str.trim();

    char flag = '+';

    // check negative or positive
    int i = 0;
    if (str.charAt(0) == '-') {
      flag = '-';
      i++;
    } else if (str.charAt(0) == '+') {
      i++;
    }
    // use double to store result
    double result = 0;

    // calculate value
    while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
      result = result * 10 + (str.charAt(i) - '0');
      i++;
    }

    if (flag == '-') {
      result = -result;
    }

    // handle max and min
    if (result > Integer.MAX_VALUE) {
      return Integer.MAX_VALUE;
    }

    if (result < Integer.MIN_VALUE) {
      return Integer.MIN_VALUE;
    }

    return (int) result;
  }
}
