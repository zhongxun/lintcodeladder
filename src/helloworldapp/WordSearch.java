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
public class WordSearch {

  int[] deltaX = {1, -1, 0, 0};
  int[] deltaY = {0, 0, 1, -1};

  public boolean exist(char[][] board, String word) {
    // write your code here
    if (board == null || board.length == 0 || board[0].length == 0) {
      return false;
    }

    if (word == null || word.length() == 0) {
      return false;
    }

    for (int x = 0; x < board.length; x++) {
      for (int y = 0; y < board[0].length; y++) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        if (search(board, word, visited, x, y)) {
          return true;
        }
      }
    }

    return false;
  }

  private boolean search(char[][] board, String word, boolean[][] visited, int x, int y) {
    if (x < 0 || x >= board.length) {
      return false;
    }

    if (y < 0 || y >= board[0].length) {
      return false;
    }

    if (visited[x][y]) {
      return false;
    }

    if (board[x][y] == word.charAt(0)) {
      if (word.length() == 1) {
        return true;
      }

      visited[x][y] = true;

      for (int i = 0; i < 4; i++) {
        if (search(board, word.substring(1), visited, x + deltaX[i], y + deltaY[i])) {
          return true;
        }
      }
    }

    return false;
  }
}
