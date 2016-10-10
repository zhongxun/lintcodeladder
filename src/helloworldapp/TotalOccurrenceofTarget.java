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
public class TotalOccurrenceofTarget {
    public int totalOccurrence(int[] A, int target) {
        // Write your code here
        if (A == null || A.length == 0) {
            return 0;
        }
        
        int first = findFirst(A, target);
        
        if (first == -1) {
            return 0;
        }
        
        int last = findLast(A, target);
        
        return last - first + 1;
    }
    
    private int findFirst(int[] A, int target) {
        int start = 0;
        int end = A.length - 1;
        
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] >= target) {
                end = mid;
            } else {
                start = mid;
            }
        }
        
        if (A[start] == target) {
            return start;
        }
        
        if (A[end] == target) {
            return end;
        }
        
        return -1;
    }
    
    private int findLast(int[] A, int target) {
        int start = 0;
        int end = A.length - 1;
        
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] <= target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        
        if (A[end] == target) {
            return end;
        }
        
        if (A[start] == target) {
            return start;
        }
        
        return -1;
    }    
}
