/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author v-xuzhon
 * 给出一个先上升后下降的整数序列，返回序列中最大的那个数的位置
 */
public class FindPeakofAscDesc {
    public int findPeak(int[] A) {
        int start = 0;
        int end = A.length - 2;
        
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] > A[mid + 1]) {
                end = mid;
            } else {
                start = mid;
            }
        }
        
        if (A[end] > A[start]) {
            return A[end];
        } else {
            return A[start];
        }
    }
}
