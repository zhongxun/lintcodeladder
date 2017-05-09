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
public class SearchA2DMatrixIITest {

  public SearchA2DMatrixIITest() {
  }

  /**
   * Test of searchMatrix method, of class SearchA2DMatrixII.
   */
  @Test
  public void testSearchMatrix() {
    System.out.println("searchMatrix");
    int[][] matrix = {
      {1, 3, 5, 7},
      {2, 4, 7, 8},
      {3, 5, 9, 10}
    };
    int target = 3;
    SearchA2DMatrixII instance = new SearchA2DMatrixII();
    int expResult = 0;
    int result = instance.searchMatrix(matrix, target);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

}
