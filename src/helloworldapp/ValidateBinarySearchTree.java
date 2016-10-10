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
public class ValidateBinarySearchTree {

    TreeNode pre = null;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBST(root.left)) {
            return false;
        }
        if (pre != null && pre.val >= root.val) {
            return false;
        }
        pre = root;
        return isValidBST(root.right);
    }

    private boolean help(TreeNode root, Integer low, Integer high) {
        if (root == null) {
            return true;
        }
        return (low == null || root.val > low) && (high == null || root.val < high) && help(root.left, low, root.val) && help(root.right, root.val, high);
    }

    public boolean isValidBST2(TreeNode root) {
        return help(root, null, null);
    }
}
