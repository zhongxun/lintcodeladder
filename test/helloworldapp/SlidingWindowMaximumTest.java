/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.Deque;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author v-xuzhon
 */
public class SlidingWindowMaximumTest {

  public SlidingWindowMaximumTest() {
  }

  /**
   * Test of maxSlidingWindow method, of class SlidingWindowMaximum.
   */
  @Test
  public void testMaxSlidingWindow() {
    System.out.println("maxSlidingWindow");
    int[] nums = {1, 2, 2, 2, 2, 7, 7, 8};
    int k = 3;
    SlidingWindowMaximum instance = new SlidingWindowMaximum();
    ArrayList<Integer> expResult = null;
    ArrayList<Integer> result = instance.maxSlidingWindow(nums, k);
    assertEquals(expResult, result);
  }

  /**
   * Test of inQueue method, of class SlidingWindowMaximum.
   */
  @Test
  public void testInQueue() {
    System.out.println("inQueue");
    Deque<Integer> deque = null;
    int num = 0;
    SlidingWindowMaximum instance = new SlidingWindowMaximum();
    instance.inQueue(deque, num);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of outQueue method, of class SlidingWindowMaximum.
   */
  @Test
  public void testOutQueue() {
    System.out.println("outQueue");
    Deque<Integer> deque = null;
    int num = 0;
    SlidingWindowMaximum instance = new SlidingWindowMaximum();
    instance.outQueue(deque, num);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of maxSlidingWindow2 method, of class SlidingWindowMaximum.
   */
  @Test
  public void testMaxSlidingWindow2() {
    System.out.println("maxSlidingWindow2");
    int[] nums = {1, 2, 2, 2, 2, 7, 7, 8};
    int k = 3;
    SlidingWindowMaximum instance = new SlidingWindowMaximum();
    ArrayList<Integer> expResult = null;
    ArrayList<Integer> result = instance.maxSlidingWindow2(nums, k);
    assertEquals(expResult, result);

  }

}
