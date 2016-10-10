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
public class LastPositionofTarget {
    public int lastPosition(int[] nums, int target) {
                // Write your code here
        if (nums == null || nums.length == 0) {
            return -1;
        }
        
        int start = 0;
        int end = nums.length - 1;
        
        while(start + 1 < end) {
            int mid = ((end - start) >> 1) + start;
            
            if (nums[mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
        } 
        
        if (nums[end] == target) {
            return end;
        }
        
        if (nums[start] == target) {
            return start;
        }
        
        return -1;
    }
    
    public static void Test() {
        LastPositionofTarget l = new LastPositionofTarget();
        int result = l.lastPosition(new int[]{1,2,2,4,5,5}, 2);
        System.out.print(result);
    }
}
