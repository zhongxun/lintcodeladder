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
public class TreeNode {

    public int val;
    public TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }

    public static TreeNode serialize(String str) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        String[] arr = str.split(",");
        int len = arr.length;
        int i = 0;

        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            i++;
            if (i < len && !arr[i].equals("#")) {
                TreeNode left = new TreeNode(Integer.parseInt(arr[i]));
                node.left = left;
                queue.offer(left);
            }

            i++;
            if (i < len && !arr[i].equals("#")) {                
                TreeNode right = new TreeNode(Integer.parseInt(arr[i]));
                node.right = right;
                queue.offer(right);
            }
        }
        
        return root;
    }
}
