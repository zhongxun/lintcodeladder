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
public class Sum4Test {
  
  public Sum4Test() {
  }

  /**
   * Test of fourSum method, of class Sum4.
   */
  @Test
  public void testFourSum() {
    System.out.println("fourSum");
    int[] numbers = null;
    int target = 0;
    Sum4 instance = new Sum4();
    ArrayList<ArrayList<Integer>> expResult = null;
    ArrayList<ArrayList<Integer>> result = instance.fourSum(numbers, target);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
