/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author v-xuzhon
 */
public class MinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        // write your code here
        int result = 0;
        
        if (root == null) {
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            int cnt = queue.size();
            result ++;

            for(int i = 0; i < cnt; i++) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null) {
                    break;
                }
                
                if (node.left != null) {
                    queue.offer(node.left);
                }
                
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        
        return result;
    }    
}
