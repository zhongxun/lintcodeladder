/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author v-xuzhon
 */
public class PrimeRange {

  public List<Integer> getPrimeInRange(int begin, int end) {
    List<Integer> result = new ArrayList<Integer>();

    boolean[] notPrimes = new boolean[end + 1];

    for (int i = 2; i <= end; i++) {
      if (notPrimes[i] == false) {
        for (int j = 2; i * j <= end; j++) {
          if (!notPrimes[i * j]) {
            notPrimes[i * j] = true;
          }
        }
      }
    }

    for (int i = begin; i <= end; i++) {
      if (!notPrimes[i]) {
        result.add(i);
      }
    }

    return result;
  }
}
