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
public class FindPeakofAscDescTest {

    public FindPeakofAscDescTest() {
    }

    /**
     * Test of findPeak method, of class FindPeakofAscDesc.
     */
    @Test
    public void testFindPeak() {
        System.out.println("findPeak");
        int[] A = {1, 4, 7, 3, 2};
        FindPeakofAscDesc instance = new FindPeakofAscDesc();
        int expResult = 7;
        int result = instance.findPeak(A);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
