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
public class PerfectSquaresTest {
  
  public PerfectSquaresTest() {
  }

  /**
   * Test of numSquares method, of class PerfectSquares.
   */
  @Test
  public void testNumSquares() {
    System.out.println("numSquares");
    int n = 13;
    PerfectSquares instance = new PerfectSquares();
    int expResult = 0;
    int result = instance.numSquares(n);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
