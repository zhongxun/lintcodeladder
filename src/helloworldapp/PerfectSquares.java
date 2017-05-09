/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;

/**
 *
 * @author v-xuzhon
 */
public class PerfectSquares {
    ArrayList<Integer> res = null;
    public int numSquares(int n) {
        // Write your code here
        int maxRoot = (int)Math.sqrt(n);
        
        helper(maxRoot, n, new ArrayList<Integer>());
        
        return res.size();
    }
    
    private void helper(int end, int target, ArrayList<Integer> set) {
        if (end <= 0 || target < 0) {
            return;
        }
        
        if (target == 0) {
            if (res == null || res.size() > set.size()) {
                res = new ArrayList<Integer>(set);
            }
        }
        
        for (int i = end; i >= 0; i--) {
            set.add(i);
            helper(i, target - i * i, set);
            set.remove(set.size() - 1);
        }
    }  
}
