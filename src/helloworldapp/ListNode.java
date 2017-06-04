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
public class ListNode {

  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
    next = null;
  }
  
  public static ListNode DeSerialize(String s) {
    if (s == null || s.length() == 0) {
      return null;
    }
    
    String[] nodes = s.split("->");
    
    ListNode dummy = new ListNode(0);
    ListNode prev = dummy;
    
    for (String node : nodes) {
      if (node.equals("null") || node.equals("NULL")) {
        continue;
      }
      
      prev.next = new ListNode(Integer.valueOf(node));
      prev = prev.next;
    }
    
    return dummy.next;
  }
}
