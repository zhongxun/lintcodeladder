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
public class MaximumGapTest {

  public MaximumGapTest() {
  }

  /**
   * Test of maximumGap method, of class MaximumGap.
   */
  @Test
  public void testMaximumGap() {
    System.out.println("maximumGap");
    int[] num = {1, 9, 2, 5};
    MaximumGap instance = new MaximumGap();
    int expResult = 0;
    int result = instance.maximumGap(num);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

}
