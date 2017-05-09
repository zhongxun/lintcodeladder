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
public class SequenceReconstructionTest {

    public SequenceReconstructionTest() {
    }

    /**
     * Test of sequenceReconstruction method, of class SequenceReconstruction.
     */
    @Test
    public void testSequenceReconstruction() {
        System.out.println("sequenceReconstruction");
        int[] org = {1, 2, 3};
        int[][] seqs = {{1, 2}, {1, 3}, {2, 3}};
        SequenceReconstruction instance = new SequenceReconstruction();
        boolean expResult = true;
        boolean result = instance.sequenceReconstruction(org, seqs);
        assertEquals(expResult, result);
    }

    @Test
    public void testSequenceReconstruction2() {
        System.out.println("sequenceReconstruction2");
        int[] org = {1, 2, 3};
        int[][] seqs = {{1, 2}, {1, 3}};
        SequenceReconstruction instance = new SequenceReconstruction();
        boolean expResult = false;
        boolean result = instance.sequenceReconstruction(org, seqs);
        assertEquals(expResult, result);
    }

    @Test
    public void testSequenceReconstruction3() {
        System.out.println("sequenceReconstruction3");
        int[] org = {4, 1, 5, 2, 6, 3};
        int[][] seqs = {{5, 2, 6, 3}, {4, 1, 5, 2}};
        SequenceReconstruction instance = new SequenceReconstruction();
        boolean expResult = true;
        boolean result = instance.sequenceReconstruction(org, seqs);
        assertEquals(expResult, result);
    }
}
