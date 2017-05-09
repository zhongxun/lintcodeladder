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
public class NextPermutationTest {

  public NextPermutationTest() {
  }

  /**
   * Test of nextPermutation method, of class NextPermutation.
   */
  @Test
  public void testNextPermutation() {
    System.out.println("nextPermutation");
    int[] num = {1, 1};
    NextPermutation instance = new NextPermutation();
    int[] expResult = {1, 1};
    int[] result = instance.nextPermutation(num);
    assertArrayEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
//    fail("The test case is a prototype.");
  }

}
