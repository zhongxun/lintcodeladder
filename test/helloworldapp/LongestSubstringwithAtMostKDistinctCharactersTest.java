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
public class LongestSubstringwithAtMostKDistinctCharactersTest {
  
  public LongestSubstringwithAtMostKDistinctCharactersTest() {
  }

  /**
   * Test of lengthOfLongestSubstringKDistinct method, of class LongestSubstringwithAtMostKDistinctCharacters.
   */
  @Test
  public void testLengthOfLongestSubstringKDistinct() {
    System.out.println("lengthOfLongestSubstringKDistinct");
    String s = "eceba";
    int k = 3;
    LongestSubstringwithAtMostKDistinctCharacters instance = new LongestSubstringwithAtMostKDistinctCharacters();
    int expResult = 0;
    int result = instance.lengthOfLongestSubstringKDistinct(s, k);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
