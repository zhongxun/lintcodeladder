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
public class TestTest {
  
  public TestTest() {
  }

  /**
   * Test of kthSmallest method, of class Test.
   */
  @Test
  public void testKthSmallest() {
    System.out.println("kthSmallest");
    int[][] matrix = {
      {1, 5, 7},
      {3, 7, 8},
      {4, 8, 9},};
    int k = 9;
    helloworldapp.Test instance = new helloworldapp.Test();
    int expResult = 0;
    int result = instance.kthSmallest(matrix, k);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
