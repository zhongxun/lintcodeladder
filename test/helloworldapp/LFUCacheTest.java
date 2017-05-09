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
public class LFUCacheTest {

  public LFUCacheTest() {
  }

  /**
   * Test of set method, of class LFUCache.
   */
  @Test
  public void testSet() {
    System.out.println("set");
    int key = 0;
    int value = 0;
    LFUCache instance = null;
    instance.set(key, value);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of get method, of class LFUCache.
   */
  @Test
  public void testGet() {
    System.out.println("get");
    int key = 0;
    LFUCache instance = null;
    int expResult = 0;
    int result = instance.get(key);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of addFrequency method, of class LFUCache.
   */
//  @Test
//  public void testAddFrequency() {
//    System.out.println("addFrequency");
//    LFUCache.CacheNode currentNode = null;
//    LFUCache instance = null;
//    instance.addFrequency(currentNode);
//    // TODO review the generated test code and remove the default call to fail.
//    fail("The test case is a prototype.");
//  }

  /**
   * Test of remove method, of class LFUCache.
   */
  @Test
  public void testRemove() {
    System.out.println("remove");
    int key = 0;
    LFUCache instance = null;
    int expResult = 0;
    int result = instance.remove(key);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of frequencyOf method, of class LFUCache.
   */
  @Test
  public void testFrequencyOf() {
    System.out.println("frequencyOf");
    int key = 0;
    LFUCache instance = null;
    int expResult = 0;
    int result = instance.frequencyOf(key);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of clear method, of class LFUCache.
   */
  @Test
  public void testClear() {
    System.out.println("clear");
    LFUCache instance = null;
    instance.clear();
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of size method, of class LFUCache.
   */
  @Test
  public void testSize() {
    System.out.println("size");
    LFUCache instance = null;
    int expResult = 0;
    int result = instance.size();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of isEmpty method, of class LFUCache.
   */
  @Test
  public void testIsEmpty() {
    System.out.println("isEmpty");
    LFUCache instance = null;
    boolean expResult = false;
    boolean result = instance.isEmpty();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of containsKey method, of class LFUCache.
   */
  @Test
  public void testContainsKey() {
    System.out.println("containsKey");
    int key = 0;
    LFUCache instance = null;
    boolean expResult = false;
    boolean result = instance.containsKey(key);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  @Test
  public void testSeq1() {
    //set(2,2)
    //set(1,1)
    //get(2)
    //>> 2
    //get(1)
    //>> 1
    //get(2)
    //>> 2
    //set(3,3)
    //set(4,4)
    //get(3)
    //>> -1
    //get(2)
    //>> 2
    //get(1)
    //>> 1
    //get(4)
    //>> 4    
    System.out.println("testSeq1");

    LFUCache instance = new LFUCache(3);

    instance.set(2, 2);
    instance.set(1, 1);
    int result = instance.get(2);
    System.out.println(result);
    assertEquals(2, result);

    result = instance.get(1);
    System.out.println(result);
    assertEquals(1, result);

    result = instance.get(2);
    System.out.println(result);
    assertEquals(2, result);

    instance.set(3, 3);
    instance.set(4, 4);
    result = instance.get(3);
    assertEquals(-1, result);

    result = instance.get(2);
    assertEquals(2, result);

    result = instance.get(1);
    assertEquals(1, result);

    result = instance.get(4);
    assertEquals(4, result);
  }

  @Test
  public void TestSeq2() {
    //    1, [set(2,1),get(2),set(3,2),get(2),get(3)]
    //    [1,-1,2]
    System.out.println("testSeq2");
    LFUCache instance = new LFUCache(1);
    instance.set(2, 1);
    int result = instance.get(2);
    assertEquals(1, result);

    instance.set(3, 2);
    result = instance.get(2);
    assertEquals(-1, result);

    result = instance.get(3);
    assertEquals(2, result);
  }
}
