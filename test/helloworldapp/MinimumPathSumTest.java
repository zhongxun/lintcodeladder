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
public class MinimumPathSumTest {

    public MinimumPathSumTest() {
    }

    /**
     * Test of minPathSum method, of class MinimumPathSum.
     */
    @Test
    public void testMinPathSum() {
        System.out.println("minPathSum");
        int[][] grid = {{1, 2}, {1, 1}};
        MinimumPathSum instance = new MinimumPathSum();
        int expResult = 0;
        int result = instance.minPathSum(grid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
