/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author v-xuzhon
 */
public class MinimumDepthofBinaryTreeTest {
    
    public MinimumDepthofBinaryTreeTest() {
    }

    /**
     * Test of minDepth method, of class MinimumDepthofBinaryTree.
     */
    @Test
    public void testMinDepth() {
        System.out.println("minDepth");
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        MinimumDepthofBinaryTree instance = new MinimumDepthofBinaryTree();
        int expResult = 0;
        int result = instance.minDepth(root);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
