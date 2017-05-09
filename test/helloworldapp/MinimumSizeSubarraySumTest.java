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
public class MinimumSizeSubarraySumTest {
  
  public MinimumSizeSubarraySumTest() {
  }

  /**
   * Test of minimumSize method, of class MinimumSizeSubarraySum.
   */
  @Test
  public void testMinimumSize() {
    System.out.println("minimumSize");
    int[] nums = {9,1,8,2,7,3,6,4,5,10}; //{2,3,1,2,4,3};
    int s = 55;//7;
    MinimumSizeSubarraySum instance = new MinimumSizeSubarraySum();
    int expResult = 0;
    int result = instance.minimumSize(nums, s);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
