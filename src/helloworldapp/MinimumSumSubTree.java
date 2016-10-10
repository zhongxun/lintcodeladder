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
public class MinimumSumSubTree {

    class HelperClass {

        TreeNode node;
        boolean isLeaf;
        int sum;
    }

    public int minSubTreeSum(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        
        if (root.left == null && root.right == null) {
            return Integer.MAX_VALUE;
        }
        
        int leftSum = minSubTreeSum(root.left);
        int rightSum = minSubTreeSum(root.right);
        int rootSum = root.val;
        
        rootSum += leftSum == Integer.MAX_VALUE ? root.left.val : leftSum;
        rootSum += rightSum == Integer.MAX_VALUE ? root.right.val : rightSum;
        
        return Math.min(rootSum, Math.min(leftSum, rightSum));
    }

    public int minSubTreeSum4(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int rootSum = root.val;
        int leftSum = Integer.MAX_VALUE;
        int rightSum = Integer.MAX_VALUE;

        TreeNode left = root.left;
        if (left != null) {
            if (left.left == null && left.right == null) {
                rootSum += left.val;
            } else {
                leftSum = minSubTreeSum(left);
                rootSum += leftSum;
            }
        }

        TreeNode right = root.right;
        if (right != null) {
            if (right.left == null && right.right == null) {
                rootSum += right.val;
            } else {
                rightSum = minSubTreeSum(right);
                rootSum += rightSum;
            }
        }

        return Math.min(rootSum, Math.min(leftSum, rightSum));
    }

    public int minSubTreeSum3(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        int leftSum = minSubTreeSum(root.left);
        int rightSum = minSubTreeSum(root.right);

        if (leftSum == Integer.MAX_VALUE && rightSum == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        int rootSum = root.val;
        if (leftSum == Integer.MAX_VALUE) {
            rootSum += root.left.val;
        }

        if (rightSum == Integer.MAX_VALUE) {
            rootSum += root.right.val;
        }

        if (leftSum != Integer.MAX_VALUE) {
            rootSum = Math.min(rootSum, leftSum);
        }
        if (rightSum != Integer.MAX_VALUE) {
            rootSum = Math.min(rootSum, rightSum);
        }

        return rootSum;
    }

    public int minSubTreeSum2(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return helper(root).sum;
    }

    private HelperClass helper(TreeNode root) {
        HelperClass result = new HelperClass();
        if (root == null) {
            result.sum = 0;
            return result;
        }

        if (root.left == null && root.right == null) {
            result.node = root;
            result.sum = root.val;
            result.isLeaf = true;
            return result;
        }

        HelperClass left = helper(root.left);
        HelperClass right = helper(root.right);

        int rootSum = root.val;

        if (left.isLeaf) {
            rootSum += left.sum;
        }

        if (right.isLeaf) {
            rootSum += right.sum;
        }

        if (!left.isLeaf) {
            rootSum = Math.min(rootSum, left.sum);
        }

        if (!right.isLeaf) {
            rootSum = Math.min(rootSum, right.sum);
        }

        result.sum = rootSum;
        return result;
    }
}
