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
public class ScrambleStringTest {
  
  public ScrambleStringTest() {
  }

  /**
   * Test of isScramble method, of class ScrambleString.
   */
  @Test
  public void testIsScramble() {
    System.out.println("isScramble");
    String s1 = "a";
    String s2 = "b";
    ScrambleString instance = new ScrambleString();
    boolean expResult = false;
    boolean result = instance.isScramble(s1, s2);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
