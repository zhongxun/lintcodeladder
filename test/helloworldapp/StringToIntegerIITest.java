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
public class StringToIntegerIITest {
  
  public StringToIntegerIITest() {
  }

  /**
   * Test of atoi method, of class StringToIntegerII.
   */
  @Test
  public void testAtoi() {
    System.out.println("atoi");
    String str = "10";
    StringToIntegerII instance = new StringToIntegerII();
    int expResult = 0;
    int result = instance.atoi(str);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of atoi2 method, of class StringToIntegerII.
   */
  @Test
  public void testAtoi2() {
    System.out.println("1234567890123456789012345678901234567890");
    String str = "1234567890123456789012345678901234567890";
    StringToIntegerII instance = new StringToIntegerII();
    int expResult = 0;
    int result = instance.atoi2(str);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
