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
public class MinimumSumSubTreeTest {
    
    public MinimumSumSubTreeTest() {
    }

    /**
     * Test of minSubTreeSum method, of class MinSubTree.
     */
    @Test
    public void testMinSubTreeSum() {
        System.out.println("minSubTreeSum");
        TreeNode root = TreeNode.serialize("5,1,6,2,3,3,1");
        MinimumSumSubTree instance = new MinimumSumSubTree();
        int expResult = 6;
        int result = instance.minSubTreeSum(root);
        assertEquals(expResult, result);

    }
    
}
