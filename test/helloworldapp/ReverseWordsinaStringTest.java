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
public class ReverseWordsinaStringTest {
  
  public ReverseWordsinaStringTest() {
  }

  /**
   * Test of reverseWords method, of class ReverseWordsinaString.
   */
  @Test
  public void testReverseWords_String() {
    System.out.println("reverseWords");
    String s = "  a b ";
    ReverseWordsinaString instance = new ReverseWordsinaString();
    String expResult = "";
    String result = instance.reverseWords(s);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of reverseWords method, of class ReverseWordsinaString.
   */
  @Test
  public void testReverseWords_charArr_int() {
    System.out.println("reverseWords");
    char[] a = null;
    int n = 0;
    ReverseWordsinaString instance = new ReverseWordsinaString();
    instance.reverseWords(a, n);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of cleanSpaces method, of class ReverseWordsinaString.
   */
  @Test
  public void testCleanSpaces() {
    System.out.println("cleanSpaces");
    char[] a = null;
    int n = 0;
    ReverseWordsinaString instance = new ReverseWordsinaString();
    char[] expResult = null;
    char[] result = instance.cleanSpaces(a, n);
    assertArrayEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
