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
public class NextPermutation {

  public int[] nextPermutation(int[] num) {
    if (num == null || num.length == 0) {
      return new int[0];
    }

    int len = num.length;

    int index = -1;
    for (int i = len - 2; i >= 0; i--) {
      if (num[i] < num[i + 1]) {
        index = i;
        break;
      }
    }

    if (index == -1) {
      reverse(num, 0, len - 1);
      return num;
    }

    int biggerIndex = index + 1;
    for (int i = len - 1; i > index; i--) {
      if (num[i] > num[index]) {
        biggerIndex = i;
        break;
      }
    }

    swap(num, biggerIndex, index);
    reverse(num, index + 1, len - 1);

    return num;
  }

  private void swap(int[] num, int a, int b) {
    int tmp = num[a];
    num[a] = num[b];
    num[b] = tmp;
  }

  private void reverse(int[] num, int begin, int end) {
    for (int i = begin, j = end; i < j; i++, j--) {
      swap(num, i, j);
    }
  }
}
