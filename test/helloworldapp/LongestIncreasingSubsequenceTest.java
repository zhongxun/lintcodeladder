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
public class LongestIncreasingSubsequenceTest {

    public LongestIncreasingSubsequenceTest() {
    }

    /**
     * Test of longestIncreasingSubsequence method, of class
     * LongestIncreasingSubsequence.
     */
    @Test
    public void testLongestIncreasingSubsequence() {
        System.out.println("longestIncreasingSubsequence");
        int[] nums = {4, 2, 4, 5, 3, 7};
        LongestIncreasingSubsequence instance = new LongestIncreasingSubsequence();
        int expResult = 4;
        int result = instance.longestIncreasingSubsequence(nums);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
