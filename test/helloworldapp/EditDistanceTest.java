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
public class EditDistanceTest {
    
    public EditDistanceTest() {
    }

    /**
     * Test of minDistance method, of class EditDistance.
     */
    @Test
    public void testMinDistance() {
        System.out.println("minDistance");
        String word1 = "abc";
        String word2 = "daf";
        EditDistance instance = new EditDistance();
        int expResult = 5;
        int result = instance.minDistance(word1, word2);
        assertEquals(expResult, result);       
    }
    
}
