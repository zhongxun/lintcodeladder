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
public class LongestCommonSubstringTest {
    
    public LongestCommonSubstringTest() {
    }

    /**
     * Test of longestCommonSubstring method, of class LongestCommonSubstring.
     */
    @Test
    public void testLongestCommonSubstring() {
        System.out.println("longestCommonSubstring");
        String A = "ABCD";
        String B = "CBCE";
        LongestCommonSubstring instance = new LongestCommonSubstring();
        int expResult = 2;
        int result = instance.longestCommonSubstring(A, B);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
