/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author v-xuzhon
 */
public class ThreeSumTest {

  public ThreeSumTest() {
  }

  /**
   * Test of threeSum method, of class ThreeSum.
   */
  @Test
  public void testThreeSum() {
    System.out.println("threeSum");
    int[] numbers = {1, 0, -1, -1, -1, -1, 0, 1, 1, 1}; //{-2, -3, 5, -1, -4, 5, -11, 7, 1, 2, 3, 4, -7, -1, -2, -3, -4, -5};    
    ThreeSum instance = new ThreeSum();
    ArrayList<ArrayList<Integer>> expResult = null;
    ArrayList<ArrayList<Integer>> result = instance.threeSum(numbers);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

}
