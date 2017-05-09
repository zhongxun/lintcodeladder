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
public class SetMatrixZeroesTest {

  public SetMatrixZeroesTest() {
  }

  /**
   * Test of setZeroes method, of class SetMatrixZeroes.
   */
  @Test
  public void testSetZeroes() {
    System.out.println("setZeroes");
    int[][] matrix = {{-4, -2147483648, 6, -7, 0}, {-8, 6, -8, -6, 0}, {2147483647, 2, -9, -6, -10}};//{{1, 0, 3}};
    SetMatrixZeroes instance = new SetMatrixZeroes();
    instance.setZeroes(matrix);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

}
