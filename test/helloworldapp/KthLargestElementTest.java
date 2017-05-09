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
public class KthLargestElementTest {

  public KthLargestElementTest() {
  }

  /**
   * Test of kthLargestElement method, of class KthLargestElement.
   */
  @Test
  public void testKthLargestElement() {
    System.out.println("kthLargestElement");
    int k = 0;
    int[] nums = null;
    KthLargestElement instance = new KthLargestElement();
    int expResult = 0;
    int result = instance.kthLargestElement(k, nums);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of helper method, of class KthLargestElement.
   */
  @Test
  public void testHelper() {
    System.out.println("helper");
    int[] nums = null;
    int l = 0;
    int r = 0;
    int k = 0;
    KthLargestElement instance = new KthLargestElement();
    int expResult = 0;
    int result = instance.helper(nums, l, r, k);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of partition method, of class KthLargestElement.
   */
  @Test
  public void testPartition() {
    System.out.println("partition");
    int[] nums = {5, 6, 3, 2, 8};
    int left = 0;
    int right = 4;
    KthLargestElement instance = new KthLargestElement();
    int expResult = 0;
    int result = instance.partition(nums, left, right);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

}
