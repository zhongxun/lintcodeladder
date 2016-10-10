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
public class PalindromePartitioning {

    public List<List<String>> partition(String s) {
        // write your code here
        List<List<String>> result = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        partition(s.toCharArray(), 0, s.length(), result, list);
        return result;
    }

    private void partition(char[] arr, int start, int end, List<List<String>> result, List<String> list) {
        if (start >= end) {
            result.add(new ArrayList<String>(list));
            return;
        }

        for (int i = start; i < end; i++) {
            if (isPal(start, i, arr)) {
                list.add(new String(arr, start, i - start + 1));
                partition(arr, i + 1, end, result, list);
                list.remove(list.size() - 1);
            }
        }
    }

    private boolean isPal(int start, int end, char[] arr) {
        int i = start;
        int j = end;
        while (i < j) {
            if (arr[i++] != arr[j--]) {
                return false;
            }
        }

        return true;
    }
}
