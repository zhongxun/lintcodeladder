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
public class LongestPalindromicSubstringTest {
  
  public LongestPalindromicSubstringTest() {
  }

  /**
   * Test of longestPalindrome method, of class LongestPalindromicSubstring.
   */
  @Test
  public void testLongestPalindrome() {
    System.out.println("longestPalindrome");
    String s = "bab";
    LongestPalindromicSubstring instance = new LongestPalindromicSubstring();
    String expResult = "";
    String result = instance.longestPalindrome(s);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of longestPalindrome2 method, of class LongestPalindromicSubstring.
   */
  @Test
  public void testLongestPalindrome2() {
    System.out.println("longestPalindrome2");
    String s = "bb";
    LongestPalindromicSubstring instance = new LongestPalindromicSubstring();
    String expResult = "";
    String result = instance.longestPalindrome2(s);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
