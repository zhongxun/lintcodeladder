/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author v-xuzhon
 */
public class ReverseLinkedListII {

  public ListNode reverseBetween(ListNode head, int m, int n) {
    // write your code
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    head = dummy;

    ListNode curt = head;
    ListNode premTail = curt;

    for (int i = 1; i <= m; i++) {
      if (curt == null) {
        return null;
      }
      
      premTail = curt;
      curt = curt.next;
    }

    ListNode reverseTail = curt;
    ListNode prev = null;

    for (int i = m; i <= n; i++) {
      if (curt == null) {
        return null;
      }
      
      ListNode temp = curt.next;
      curt.next = prev;
      prev = curt;
      curt = temp;
    }

    premTail.next = prev;
    reverseTail.next = curt;

    return dummy.next;
  }
}
