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
public class MinimumWindowSubstring {

  public String minWindow(String source, String target) {
    // write your code
    if (source == null || source.length() == 0) {
      return "";
    }

    if (target == null) {
      return "";
    }

    int[] targetHash = new int[256];

    for (char c : target.toCharArray()) {
      targetHash[c]++;
    }

    int targetNum = target.length();
    int sourceNum = 0;
    int start = 0;
    int end = 0;
    int min = Integer.MAX_VALUE;
    int left = 0;
    int right = source.length();

    String ans = "";

    for (end = 0; end < source.length(); end++) {
      char c = source.charAt(end);

      if (targetHash[c] > 0) {
        sourceNum++;
      }

      targetHash[c]--;

      while (sourceNum >= targetNum) {
        if (end - start + 1 < min) {
          min = end - start + 1;
          //ans = source.substring(start, end + 1);
          left = start;
          right = end;
        }

        char d = source.charAt(start);
        targetHash[d]++;
        if (targetHash[d] > 0) {
          sourceNum--;
        }

        start++;
      }
    }

    return source.substring(left, right);
  }

  public String minWindow3(String source, String target) {
    // write your code
    if (source == null || source.length() == 0) {
      return "";
    }

    if (target == null) {
      return "";
    }

    int[] targetHash = new int[256];

    initTargetHash(targetHash, target);

    int targetNum = target.length();
    int sourceNum = 0;
    int start = 0;
    int end = 0;
    int min = Integer.MAX_VALUE;
    String ans = "";

    for (end = 0; end < source.length(); end++) {
      char c = source.charAt(end);

      if (targetHash[c] > 0) {
        sourceNum++;

      }
      targetHash[c]--;
      while (sourceNum >= targetNum) {
        if (end - start + 1 < min) {
          min = end - start + 1;
          ans = source.substring(start, end + 1);
        }

        targetHash[source.charAt(start)]++;
        if (targetHash[source.charAt(start)] > 0) {
          sourceNum--;
        }

        start++;
      }
    }

    return ans;
  }

  private void initTargetHash(int[] targetHash, String target) {
    for (char c : target.toCharArray()) {
      targetHash[c]++;
    }
  }

  public String minWindow2(String source, String target) {
    // write your code
    boolean[] chars = new boolean[256];

    long hash = 0;
    for (char c : target.toCharArray()) {
      chars[c] = true;
      hash += c;
    }

    int len = source.length();
    int tLen = target.length();
    int min = Integer.MAX_VALUE;
    int start = 0;
    int end = 0;
    int cnt = 0;
    int left = 0;
    int right = len - 1;
    long sHash = 0;

    while (start < len - tLen + 1 && end < len) {
      while (cnt < tLen && end < len) {
        char c = source.charAt(end);
        if (chars[c]) {
          sHash += c;

          if (cnt == 0) {
            start = end;
          }
          cnt++;
        }

        end++;
      }

      if (cnt == tLen && sHash == hash) {
        if (end - start < min) {
          min = end - start;
          left = start;
          right = end;
        }
      }

      if (cnt == tLen) {
        char c = source.charAt(start);
        sHash -= c;
        start++;
        while (start < end && start < len) {
          c = source.charAt(start);
          if (chars[c]) {
            break;
          }
          start++;
        }

        cnt--;
      }
    }

    return right > left ? source.substring(left, right) : "";
  }
}
