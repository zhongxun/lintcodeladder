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
public class FirstMissingPositiveTest {
  
  public FirstMissingPositiveTest() {
  }

  /**
   * Test of firstMissingPositive method, of class FirstMissingPositive.
   */
  @Test
  public void testFirstMissingPositive() {
    System.out.println("firstMissingPositive");
    int[] A = {1,2,0} ;//{3,4,-1,1} ;// {100, 72, 308};
    FirstMissingPositive instance = new FirstMissingPositive();
    int expResult = 0;
    int result = instance.firstMissingPositive(A);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
