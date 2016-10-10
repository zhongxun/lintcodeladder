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
public class CopyBooksTest {
    
    public CopyBooksTest() {
    }

    /**
     * Test of init method, of class CopyBooks.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        int[] A = null;
        CopyBooks instance = new CopyBooks();
        int[][] expResult = null;
        int[][] result = instance.init(A);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of copyBooks method, of class CopyBooks.
     */
    @Test
    public void testCopyBooks() {
        System.out.println("copyBooks");
        int[] pages = {3,2,4};
        int k = 2;
        CopyBooks instance = new CopyBooks();
        int expResult = 5;
        int result = instance.copyBooks(pages, k);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
