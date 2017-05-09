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
public class KthSmallestNumbersinUnsortedArrayTest {
    
    public KthSmallestNumbersinUnsortedArrayTest() {
    }

    /**
     * Test of kthSmallest method, of class KthSmallestNumbersinUnsortedArray.
     */
    @Test
    public void testKthSmallest() {
        System.out.println("kthSmallest");
        int k = 3;
        int[] nums = {3,4,1,2,5};
        KthSmallestNumbersinUnsortedArray instance = new KthSmallestNumbersinUnsortedArray();
        int expResult = 0;
        int result = instance.kthSmallest(k, nums);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
