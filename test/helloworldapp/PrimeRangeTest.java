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
public class PrimeRangeTest {
  
  public PrimeRangeTest() {
  }

  /**
   * Test of getPrimeInRange method, of class PrimeRange.
   */
  @Test
  public void testGetPrimeInRange() {
    System.out.println("getPrimeInRange");
    int begin = 1;
    int end = 10;
    PrimeRange instance = new PrimeRange();
    List<Integer> expResult = null;
    List<Integer> result = instance.getPrimeInRange(begin, end);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
