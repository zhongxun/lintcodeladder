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
public class InsertionSortListTest {
  
  public InsertionSortListTest() {
  }

  /**
   * Test of insertionSortList method, of class InsertionSortList.
   */
  @Test
  public void testInsertionSortList() {
    System.out.println("insertionSortList");
    ListNode head = ListNode.DeSerialize("1->3->2->0->null");
    InsertionSortList instance = new InsertionSortList();
    ListNode expResult = null;
    ListNode result = instance.insertionSortList(head);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
