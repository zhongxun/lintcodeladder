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
public class LRUCacheTest {
  
  public LRUCacheTest() {
  }

  /**
   * Test of get method, of class LRUCache.
   */
  @Test
  public void testGet() {
    System.out.println("get");
    int key = 0;
    LRUCache instance = new LRUCache(2);
    int expResult = -1;
    int result = instance.get(key);
    assertEquals(expResult, result);
  }

  /**
   * Test of set method, of class LRUCache.
   */
  @Test
  public void testSet() {
    System.out.println("set");
    int key = 0;
    int value = 2;
    LRUCache instance = new LRUCache(1);
    instance.set(key, value);
    int expected = 2;
    int actual = instance.get(0);
    assertEquals(expected, actual);
  }
  
  @Test
  public void sequenceTest() {
    System.out.println("sequence test");
    int key = 0;
    int value = 2;
    LRUCache instance = new LRUCache(2);
    instance.set(0, 2);
    instance.set(1, 3);
    instance.get(1);
    instance.set(4, 3);
    int actual = instance.get(0);
    assertEquals(-1, actual);
    assertEquals(3, instance.get(1));
  }
}
