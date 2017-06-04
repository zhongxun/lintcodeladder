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
public class BigIntegermultiplicationTest {
  
  public BigIntegermultiplicationTest() {
  }

  /**
   * Test of multiply method, of class BigIntegermultiplication.
   */
  @Test
  public void testMultiply() {
    System.out.println("multiply");
    String num1 = "123";
    String num2 = "45";
    BigIntegermultiplication instance = new BigIntegermultiplication();
    String expResult = "";
    String result = instance.multiply(num1, num2);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
