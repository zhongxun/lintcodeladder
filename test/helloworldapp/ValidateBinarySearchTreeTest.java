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
public class ValidateBinarySearchTreeTest {
    
    public ValidateBinarySearchTreeTest() {
    }

    /**
     * Test of isValidBST method, of class ValidateBinarySearchTree.
     */
    @Test
    public void testIsValidBST() {
        System.out.println("isValidBST");
        TreeNode root = TreeNode.serialize("10,5,15,#,#,6,20");
        ValidateBinarySearchTree instance = new ValidateBinarySearchTree();
        boolean expResult = false;
        boolean result = instance.isValidBST(root);
        assertEquals(expResult, result);
    }
    
}
