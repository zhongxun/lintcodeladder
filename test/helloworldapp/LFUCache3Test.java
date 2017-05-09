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
public class LFUCache3Test {

  public LFUCache3Test() {
  }

  /**
   * Test of set method, of class LFUCache3.
   */
  @Test
  public void testSet() {
    System.out.println("set");
    int key = 0;
    int value = 0;
    LFUCache3 instance = null;
    instance.set(key, value);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of get method, of class LFUCache3.
   */
  @Test
  public void testGet() {
    System.out.println("get");
    
    LFUCache3 instance = new LFUCache3(3);
    
    
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
    LFUCache3 instance = new LFUCache3(1);
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
