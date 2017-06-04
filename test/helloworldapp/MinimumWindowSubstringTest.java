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
public class MinimumWindowSubstringTest {
  
  public MinimumWindowSubstringTest() {
  }

  /**
   * Test of minWindow method, of class MinimumWindowSubstring.
   */
  @Test
  public void testMinWindow() {
    System.out.println("minWindow");
    String source = "abc"; //"aaaaaaaaaaaabbbbbcdd";
    String target = "a"; //"abcdd";
    MinimumWindowSubstring instance = new MinimumWindowSubstring();
    String expResult = "";
    String result = instance.minWindow(source, target);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
