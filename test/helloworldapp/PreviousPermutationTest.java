/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author v-xuzhon
 */
public class PreviousPermutationTest {

  public PreviousPermutationTest() {
  }

  /**
   * Test of previousPermuation method, of class PreviousPermutation.
   */
  @Test
  public void testPreviousPermuation() {
    System.out.println("previousPermuation");
    Integer[] arr = new Integer[]{1, 1}; //1, 3, 2, 4, 3, 5};
    ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(arr));//<Integer>();
    PreviousPermutation instance = new PreviousPermutation();
    ArrayList<Integer> expResult = new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 2, 3, 3}));
    ArrayList<Integer> result = instance.previousPermuation(nums);
    assertEquals(expResult, result);
  }

}
