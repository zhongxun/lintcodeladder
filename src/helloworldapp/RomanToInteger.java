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
public class RomanToInteger {

  public int romanToInt(String s) {
    // Write your code here

    if (s == null || s.length() == 0) {
      return 0;
    }

    Map<String, Integer> mapTwo = new HashMap<>();
    mapTwo.put("IV", 4);
    mapTwo.put("IX", 9);
    mapTwo.put("XL", 40);
    mapTwo.put("XC", 90);
    mapTwo.put("CD", 400);
    mapTwo.put("CM", 900);

    Map<String, Integer> mapOne = new HashMap<>();
    mapOne.put("I", 1);
    mapOne.put("V", 5);
    mapOne.put("X", 10);
    mapOne.put("L", 50);
    mapOne.put("C", 100);
    mapOne.put("D", 500);
    mapOne.put("M", 1000);

    int i = 0;
    int result = 0;

    while (i + 2 <= s.length()) {
      String two = s.substring(i, i + 2);
      if (mapTwo.containsKey(two)) {
        result = result + mapTwo.get(two);
        i = i + 2;
        continue;
      }

      String one = s.substring(i, i + 1);
      if (mapOne.containsKey(one)) {
        result = result + mapOne.get(one);
        i = i + 1;
      }
    }

    if (i < s.length()) {
      String one = s.substring(i, i + 1);
      if (mapOne.containsKey(one)) {
        result = result + mapOne.get(one);
        i = i + 1;
      }
    }

    return result;
  }

  public int romanToInt2(String s) {
    // Write your code here
    if (s == null || s.length() == 0) {
      return 0;
    }

    int len = s.length();

    Map<Character, Integer> mapOne = new HashMap<>();
    mapOne.put('I', 1);
    mapOne.put('V', 5);
    mapOne.put('X', 10);
    mapOne.put('L', 50);
    mapOne.put('C', 100);
    mapOne.put('D', 500);
    mapOne.put('M', 1000);

    int result = mapOne.get(s.charAt(len - 1));

    for (int i = len - 2; i >= 0; i--) {
      int d = mapOne.get(s.charAt(i));

      if (mapOne.get(s.charAt(i + 1)) <= d) {
        result += d;
      } else {
        result -= d;
      }
    }

    return result;
  }
}
