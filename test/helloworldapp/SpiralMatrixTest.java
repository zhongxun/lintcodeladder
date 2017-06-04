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
public class SpiralMatrixTest {

  public SpiralMatrixTest() {
  }

  /**
   * Test of spiralOrder method, of class SpiralMatrix.
   */
  @Test
  public void testSpiralOrder() {
    System.out.println("spiralOrder");
//    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
//    int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    int[][] matrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, { 11, 12, 13, 14, 15}};
    SpiralMatrix instance = new SpiralMatrix();
    List<Integer> expResult = null;
    List<Integer> result = instance.spiralOrder(matrix);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

}
