/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author v-xuzhon
 */
public class KthSmallestNumberinSortedMatrixTest {

  public KthSmallestNumberinSortedMatrixTest() {
  }

  /**
   * Test of kthSmallest method, of class KthSmallestNumberinSortedMatrix.
   */
//  @Test
//  public void testKthSmallest() {
//    System.out.println("kthSmallest");
//    int[][] matrix = {
//      {1, 5, 7},
//      {3, 7, 8},
//      {4, 8, 9},};
//    int k = 0;
//    KthSmallestNumberinSortedMatrix instance = new KthSmallestNumberinSortedMatrix();
//    int expResult = 0;
//    int result = instance.kthSmallest(matrix, k);
//    assertEquals(expResult, result);
//    // TODO review the generated test code and remove the default call to fail.
//    fail("The test case is a prototype.");
//  }

  /**
   * Test of kthSmallest2 method, of class KthSmallestNumberinSortedMatrix.
   */
  @Test
  public void testKthSmallest2() {
    System.out.println("kthSmallest2");
    int[][] matrix = {
      {1, 5, 7},
      {3, 7, 8},
      {4, 8, 9},};
    int k = 0;
    KthSmallestNumberinSortedMatrix instance = new KthSmallestNumberinSortedMatrix();
    int expResult = 0;
    int result = instance.kthSmallest2(matrix, k);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of kthSmallestSearch method, of class KthSmallestNumberinSortedMatrix.
   */
  @Test
  public void testKthSmallestSearch() {
    System.out.println("kthSmallestSearch");
    int[][] matrix =  {
      {1, 5, 7},
      {3, 7, 8},
      {4, 8, 9},};
    int k = 5;
    KthSmallestNumberinSortedMatrix instance = new KthSmallestNumberinSortedMatrix();
    int expResult = 7;
    int result = instance.kthSmallestSearch(matrix, k);
    assertEquals(expResult, result);
  }

}
