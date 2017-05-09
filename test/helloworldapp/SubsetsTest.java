/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author v-xuzhon
 */
public class SubsetsTest {

  public SubsetsTest() {
  }

  /**
   * Test of subsets method, of class Subsets.
   */
  @Test
  public void testSubsets() {
    System.out.println("subsets");
    int[] nums = {11, 4, 5, 6, 10, 8, 9, 1, 2, 3, 0};
    Subsets instance = new Subsets();
    ArrayList<ArrayList<Integer>> expResult = null;
    ArrayList<ArrayList<Integer>> result = null;
    long l = System.currentTimeMillis();
    for (int i = 0; i < 1000; i++) {
      instance.g = 0;
      result = instance.subsets(nums);
      
    }
    System.out.println("time1");
    System.out.println(instance.g);    
    System.out.println(System.currentTimeMillis() - l);

    l = System.currentTimeMillis();
    for (int i = 0; i < 1000; i++) {
      instance.g = 0;
      result = instance.subsetsIterate(nums);
    
    }
    System.out.println("time2");
    System.out.println(instance.g);    
    System.out.println(System.currentTimeMillis() - l);

//    assertEquals(expResult, result);
//    // TODO review the generated test code and remove the default call to fail.
//    fail("The test case is a prototype.");
  }

}
