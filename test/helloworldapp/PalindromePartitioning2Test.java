/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author v-xuzhon
 */
public class PalindromePartitioning2Test {
  
  public PalindromePartitioning2Test() {
  }

  /**
   * Test of partition method, of class PalindromePartitioning2.
   */
  @Test
  public void testPartition() {
    System.out.println("partition");
    String s = "aab";
    PalindromePartitioning2 instance = new PalindromePartitioning2();
    List<List<String>> expResult = null;
    List<List<String>> result = instance.partition(s);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
