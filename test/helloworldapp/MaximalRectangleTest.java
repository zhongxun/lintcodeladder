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
public class MaximalRectangleTest {

  public MaximalRectangleTest() {
  }

  /**
   * Test of maximalRectangle method, of class MaximalRectangle.
   */
  @Test
  public void testMaximalRectangle() {
    System.out.println("maximalRectangle");
    boolean[][] matrix = {
      {true, true, false, false, true},
      {false, true, false, false, true},
      {false, false, true, true, true},
      {false, false, true, true, true},
      {false, false, false, false, true}
    };
    MaximalRectangle instance = new MaximalRectangle();
    int expResult = 0;
    int result = instance.maximalRectangle(matrix);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

}
