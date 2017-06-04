/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 *
 * @author v-xuzhon
 */
public class LetterCombinationsofaPhoneNumber {

  private Map<String, ArrayList<String>> cache = new HashMap<String, ArrayList<String>>();
  private char[][] arr = {{'a', 'b', 'c'},
  {'d', 'e', 'f'},
  {'g', 'h', 'i'},
  {'j', 'k', 'l'},
  {'m', 'n', 'o'},
  {'p', 'q', 'r'},
  {'s', 't', 'u'},
  {'v', 'w', 'x'},
  {'y', 'z', '#'}
  };

  public ArrayList<String> letterCombinations2(String digits) {
    // Write your code here
    ArrayList<String> result = new ArrayList<String>();

    if (digits == null || digits.length() == 0) {
      return result;
    }

    if (cache.containsKey(digits)) {
      return cache.get(digits);
    }

    for (char c : arr[digits.charAt(0) - '2']) {
      for (String s : letterCombinations2(digits.substring(1))) {
        result.add(String.valueOf(c) + s);
      }
    }

    cache.put(digits, result);

    return result;
  }

  public List<String> letterCombinations(String digits) {
    LinkedList<String> ans = new LinkedList<String>();
    String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    ans.add("");
    for (int i = 0; i < digits.length(); i++) {
      int x = Character.getNumericValue(digits.charAt(i));
      while (ans.peek().length() == i) {
        String t = ans.remove();
        for (char s : mapping[x].toCharArray()) {
          ans.add(t + s);
        }
      }
    }

    String w = "ttest" + 't';
    System.out.print(w);
    return ans;
  }
}
