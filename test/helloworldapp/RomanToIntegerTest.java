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
public class RomanToIntegerTest {
  
  public RomanToIntegerTest() {
  }

  /**
   * Test of romanToInt method, of class RomanToInteger.
   */
  @Test
  public void testRomanToInt() {
    System.out.println("romanToInt");
    String s = "DCXXI";
    RomanToInteger instance = new RomanToInteger();
    int expResult = 0;
    int result = instance.romanToInt(s);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of romanToInt2 method, of class RomanToInteger.
   */
  @Test
  public void testRomanToInt2() {
    System.out.println("romanToInt2");
    String s = "DCXXI";
    RomanToInteger instance = new RomanToInteger();
    int expResult = 0;
    int result = instance.romanToInt2(s);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
