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
public class BuildPostOfficeIITest {
    
    public BuildPostOfficeIITest() {
    }

    /**
     * Test of shortestDistance method, of class BuildPostOfficeII.
     */
    @Test
    public void testShortestDistance() {
        System.out.println("shortestDistance");
        int[][] grid = {{0,1,0,0,0},{1,0,0,2,1},{0,1,0,0,0}};
        BuildPostOfficeII instance = new BuildPostOfficeII();
        int expResult = 8;
        int result = instance.shortestDistance(grid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
