/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author v-xuzhon
 */
public class CountofSmallerNumber {

    public ArrayList<Integer> countOfSmallerNumber(int[] A, int[] queries) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<Integer>();

        if (queries == null || queries.length == 0) {
            return result;
        }

        Arrays.sort(A);

        for (int target : queries) {
            int count = findSmallerCounter(A, target);
            result.add(count);
        }

        return result;
    }

    private int findSmallerCounter(int[] A, int target) {
        if (A == null || A.length == 0) {
            return 0;
        }

        int start = 0;
        int end = A.length - 1;

        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (target > A[end]) {
            return end + 1;
        }

        if (target > A[start]) {
            return start + 1;
        }

        return 0;
    }

    public static void Test() {
        CountofSmallerNumber c = new CountofSmallerNumber();
//        int[] A = {1, 2, 3, 4, 5, 6};
//        int[] queries = {1, 2, 3, 4};

        int[] A = {57, 67};
        int[] queries = {60, 70};
        ArrayList<Integer> result = c.countOfSmallerNumber(A, queries);
        System.out.println(result);
    }
}
