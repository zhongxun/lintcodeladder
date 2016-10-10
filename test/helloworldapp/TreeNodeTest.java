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
public class TreeNodeTest {
    
    public TreeNodeTest() {
    }

    /**
     * Test of serialize method, of class TreeNode.
     */
    @Test
    public void testSerialize() {
        System.out.println("serialize");
        String str = "5,1,6,2,3,3,1";
        TreeNode expResult = null;
        TreeNode result = TreeNode.serialize(str);
        assertEquals(expResult, result);
    }
    
}
