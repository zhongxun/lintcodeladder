/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author v-xuzhon
 */
public class LRUCache {

  private class ListNode {

    ListNode prev;
    ListNode next;
    int val;
    int key;

    public ListNode(int key, int val) {
      this.key = key;
      this.val = val;
    }
  }

  private Map<Integer, ListNode> map;
  private ListNode head;
  private ListNode tail;
  private int capacity;
  
//  public LRUCache(int capacity) {
  public LRUCache(int capacity) {
        // write your code here
    
    this.map  = new HashMap<Integer, ListNode>();
    this.head = new ListNode(-1, -1);
    this.tail = new ListNode(-1, -1);
    this.head.next = this.tail;
    this.tail.prev = this.head;
    this.capacity = capacity;
  }

  public int get(int key) {
    if (!this.map.containsKey(key)) {
      return -1;
    }
    
    ListNode node = this.map.get(key);
    
    node.prev.next = node.next;
    node.next.prev = node.prev;
    
    moveToTail(node);
    
    return node.val;
  }

  public void set(int key, int value) {
    if (this.get(key) != -1) {
      this.map.get(key).val = value;
      return;
    }
    
    if (this.map.size() >= this.capacity) {
      int removeKey = this.head.next.key;
      this.head.next.next.prev = this.head;
      this.head.next = this.head.next.next;
      this.map.remove(removeKey);
    }
    
    ListNode node = new ListNode(key, value);
    this.map.put(key, node);
    moveToTail(node);
  }

  private void moveToTail(ListNode node) {
    ListNode temp = tail.prev;
    tail.prev = node;
    node.next = tail;
    node.prev = temp;
    temp.next = node;
  }
}
