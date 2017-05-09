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
public class ZombieInMatrixTest {

    public ZombieInMatrixTest() {
    }

    /**
     * Test of zombie method, of class ZombieInMatrix.
     */
    @Test
    public void testZombie() {
        System.out.println("zombie");
        int[][] grid = {{0, 1, 2, 0, 0}, {1, 0, 0, 2, 1}, {0, 1, 0, 0, 0}};
        ZombieInMatrix instance = new ZombieInMatrix();
        int expResult = 2;
        int result = instance.zombie(grid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
