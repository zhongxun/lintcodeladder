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
public class InsertionSortList {

  public ListNode insertionSortList(ListNode head) {
    ListNode dummy = new ListNode(0);
    // 这个dummy的作用是，把head开头的链表一个个的插入到dummy开头的链表里
    // 所以这里不需要dummy.next = head;

    while (head != null) {
      ListNode node = dummy;
      while (node.next != null && node.next.val < head.val) {
        node = node.next;
      }
      ListNode temp = head.next;
      head.next = node.next;
      node.next = head;
      head = temp;
    }

    return dummy.next;
  }
}
