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
public class ReverseLinkedListIITest {

  public ReverseLinkedListIITest() {
  }

  /**
   * Test of reverseBetween method, of class ReverseLinkedListII.
   */
  @Test
  public void testReverseBetween() {
    System.out.println("reverseBetween");
//    String list = "1->2->3->4->5->NULL";
    String list = "3760->2881->7595->3904->5069->4421->8560->8879->8488->5040->5792->56->1007->2270->3403->6062->null";
    ListNode head = ListNode.DeSerialize(list);
    int m = 2;
    int n = 7;
    ReverseLinkedListII instance = new ReverseLinkedListII();
    ListNode expResult = null;
    ListNode result = instance.reverseBetween(head, m, n);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

}
