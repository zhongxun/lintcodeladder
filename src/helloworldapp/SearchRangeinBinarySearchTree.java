/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author v-xuzhon
 */
public class SearchRangeinBinarySearchTree {

    public ArrayList<Integer> searchRangeIterate(TreeNode root, int k1, int k2) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        TreeNode right = null;

        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                if (cur.val < k1) {
                    break; // left cut after pass 1st node less then k1
                }

                cur = cur.left;
            }

            cur = stack.pop();

            if (k1 <= cur.val && cur.val <= k2) {
                result.add(cur.val);
            }

            if (cur != right) {
                cur = cur.right;

                if (cur != null && cur.val > k2) {
                    right = cur;    // right cut after find 1st node larger than k2
                }
            } else {
                cur = null;
            }
        }

        return result;
    }

    /**
     * @param root: The root of the binary search tree.
     * @param k1 and k2: range k1 to k2.
     * @return: Return all keys that k1<=key<=k2 in increasing order.
     */
    public ArrayList<Integer> searchRange(TreeNode root, int k1, int k2) {
        ArrayList<Integer> results = new ArrayList<Integer>();
        helper(root, k1, k2, results);
        return results;
    }

    private void helper(TreeNode root, int k1, int k2, ArrayList<Integer> results) {
        if (root == null) {
            return;
        }
        
        if (root.val > k1) {
            helper(root.left, k1, k2, results);
        }
        
        if (root.val >= k1 && root.val <= k2) {
            results.add(root.val);
        }
        
        if (root.val < k2) {
            helper(root.right, k1, k2, results);
        }
    }
}
