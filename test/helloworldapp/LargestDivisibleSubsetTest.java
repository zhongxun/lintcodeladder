/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author v-xuzhon
 */
public class LargestDivisibleSubsetTest {
  
  public LargestDivisibleSubsetTest() {
  }

  /**
   * Test of largestDivisibleSubset method, of class LargestDivisibleSubset.
   */
  @Test
  public void testLargestDivisibleSubset() {
    System.out.println("largestDivisibleSubset");
    int[] nums = {8,2,4,1};
    LargestDivisibleSubset instance = new LargestDivisibleSubset();
    List<Integer> expResult = null;
    List<Integer> result = instance.largestDivisibleSubset(nums);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of sqrt method, of class LargestDivisibleSubset.
   */
  @Test
  public void testSqrt() {
    System.out.println("sqrt");
    int n = 13;
    LargestDivisibleSubset instance = new LargestDivisibleSubset();
    int expResult = 0;
    int result = instance.sqrt(n);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
