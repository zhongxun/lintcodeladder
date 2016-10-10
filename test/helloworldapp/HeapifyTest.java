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
public class HeapifyTest {

    public HeapifyTest() {
    }

    /**
     * Test of heapify method, of class Heapify.
     */
    @Test
    public void testHeapify() {
        System.out.println("heapify");
        int[] A = {3, 2, 5, 4, 1};
        Heapify instance = new Heapify();
        instance.heapify(A);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of heapifyUp method, of class Heapify.
     */
    @Test
    public void testHeapifyUp() {
        System.out.println("heapifyUp");
        int[] A = {3, 2, 1, 4, 5};
        Heapify instance = new Heapify();
        instance.heapifyUp(A);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
