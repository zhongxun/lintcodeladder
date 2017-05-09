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
public class BinaryTreeSerialization {
    /**
     * This method will be invoked first, you should design your own algorithm 
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    public String serialize(TreeNode root) {
        // write your code here
        if (root == null) {
          return "#";
        }
        
        StringBuffer sb = new StringBuffer();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        queue.offer(root);
        
        while(!queue.isEmpty()) {
          int size = queue.size();
          for (int i = 0; i < size; i++) {
            TreeNode node = queue.poll();
            sb.append(Integer.toString(node.val) + ",");
            
            if (node.left == null) {
              sb.append("#,");
            } else {
              queue.offer(node.left);
            }
            
            if (node.right == null) {
              sb.append("#,");
            } else {
              queue.offer(node.right);
            }
          }
        }
        
        return sb.toString();
    }
    
    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in 
     * "serialize" method.
     */
    public TreeNode deserialize(String data) {
        // write your code here
        if (data == null || data.length() == 0 || data == "#") {
          return null;
        }
        
        String[] arr = data.split(",");
        
        TreeNode root = new TreeNode(Integer.valueOf(arr[0]));
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int j = 1;
        
        while(!queue.isEmpty()) {
          int size = queue.size();
          
          for (int i = 0; i < size; i++) {
            TreeNode node = queue.poll();
            
            if (j < arr.length && !arr[j].equals("#")) {
              node.left = new TreeNode(Integer.valueOf(arr[j]));
              queue.offer(node.left);              
            }
            j++;
            
            if (j < arr.length && !arr[j].equals("#")) {
              node.right = new TreeNode(Integer.valueOf(arr[j]));
              queue.offer(node.right);
            }
            j++;
          }
        }
        
        return root;
    }  
}
