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
public class TotalOccurrenceofTargetTest {

    public TotalOccurrenceofTargetTest() {
    }

    /**
     * Test of totalOccurrence method, of class TotalOccurrenceofTarget.
     */
    @Test
    public void testTotalOccurrence() {
        System.out.println("totalOccurrence");
        int[] A = {1, 3, 3, 4, 5};
        int target = 3;
        TotalOccurrenceofTarget instance = new TotalOccurrenceofTarget();
        int expResult = 2;
//        int result = instance.totalOccurrence(A, target);
//        assertEquals(expResult, result);
        assertEquals(1, instance.totalOccurrence(new int[]{2, 2, 3, 4, 6}, 4));
    }

}
