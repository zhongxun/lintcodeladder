/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author v-xuzhon
 */
public class SetMatrixZeroes {

  public void setZeroes(int[][] matrix) {
    // write your code here
    if (matrix == null || matrix.length == 0) {
      return;
    }

    if (matrix[0] == null || matrix[0].length == 0) {
      return;
    }

    boolean emptyCol = false;
    for (int i = 0; i < matrix.length; i++) {
      if (matrix[i][0] == 0) {
        emptyCol = true;
        break;
      }
    }

    boolean emptyRow = false;
    for (int j = 0; j < matrix[0].length; j++) {
      if (matrix[0][j] == 0) {
        emptyRow = true;
        break;
      }
    }

    scanEdge(matrix);
    markMatrix(matrix);

    if (emptyCol) {
      for (int i = 0; i < matrix.length; i++) {
        matrix[i][0] = 0;
      }
    }

    if (emptyRow) {
      for (int j = 0; j < matrix[0].length; j++) {
        matrix[0][j] = 0;
      }
    }
  }

  private void scanEdge(int[][] matrix) {
    for (int i = 1; i < matrix.length; i++) {
      for (int j = 1; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0) {
          matrix[i][0] = 0;
          matrix[0][j] = 0;
        }
      }
    }
  }

  private void markMatrix(int[][] matrix) {
    for (int i = 1; i < matrix.length; i++) {
      for (int j = 1; j < matrix[0].length; j++) {
        if (matrix[i][0] == 0 || matrix[0][j] == 0) {
          matrix[i][j] = 0;
        }
      }
    }
  }
}
