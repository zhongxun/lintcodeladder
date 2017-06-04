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
public class WordSearchTest {
  
  public WordSearchTest() {
  }

  /**
   * Test of exist method, of class WordSearch.
   */
  @Test
  public void testExist() {
    System.out.println("exist");
    char[][] board = {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
    String word = "ABCESEEEFS";
    WordSearch instance = new WordSearch();
    boolean expResult = false;
    boolean result = instance.exist(board, word);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
