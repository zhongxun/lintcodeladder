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
public class RotateListTest {
  
  public RotateListTest() {
  }

  /**
   * Test of rotateRight method, of class RotateList.
   */
  @Test
  public void testRotateRight() {
    System.out.println("rotateRight");
//    ListNode head = new ListNode(1);
//    int k = 999;
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    int k = 2;
    RotateList instance = new RotateList();
    ListNode expResult = null;
    ListNode result = instance.rotateRight(head, k);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
