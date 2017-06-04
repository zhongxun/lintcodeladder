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
public class RotateList {

  class ReversedList {

    ListNode head;
    ListNode tail;
    ListNode next;
  }

  public ListNode rotateRight2(ListNode head, int k) {
    // write your code here
    if (head == null) {
      return null;
    }

    int len = getLen(head);
    k %= len;

    if (k <= 0) {
      return head;
    }

    ReversedList all = reverse(head, len);
    ReversedList left = reverse(all.head, k);
    ReversedList right = reverse(left.next, len - k);

    left.tail.next = right.head;

    return left.head;
  }

  private int getLen(ListNode node) {
    int cnt = 0;

    while (node != null) {
      cnt++;
      node = node.next;
    }

    return cnt;
  }

  private ReversedList reverse(ListNode head, int len) {
    ReversedList result = new ReversedList();
    result.tail = head;
    ListNode prev = null;

    while (len > 0) {
      ListNode temp = head.next;
      head.next = prev;
      prev = head;
      head = temp;
      len--;
    }

    result.head = prev;
    result.next = head;

    return result;
  }

  private int getLength(ListNode head) {
    int length = 0;
    while (head != null) {
      length++;
      head = head.next;
    }
    return length;
  }

  public ListNode rotateRight(ListNode head, int n) {
    if (head == null) {
      return null;
    }

    int length = getLength(head);
    n = n % length;

    ListNode dummy = new ListNode(0);
    dummy.next = head;
    head = dummy;

    ListNode tail = dummy;
    for (int i = 0; i < n; i++) {
      head = head.next;
    }

    while (head.next != null) {
      tail = tail.next;
      head = head.next;
    }

    head.next = dummy.next;
    dummy.next = tail.next;
    tail.next = null;
    return dummy.next;
  }
}
