/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f20170507;

import f20170507.strStr;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author v-xuzhon
 */
public class strStrTest {
  
  public strStrTest() {
  }

  /**
   * Test of strStr method, of class strStr.
   */
  @Test
  public void testStrStr() {
    System.out.println("strStr");
    String source = "abc";
    String target = "bc";
    strStr instance = new strStr();
    int expResult = 0;
    int result = instance.strStr(source, target);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
