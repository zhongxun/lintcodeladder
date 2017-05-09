/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author v-xuzhon
 */
public class WordBreakTest {

  public WordBreakTest() {
  }

  /**
   * Test of wordBreak method, of class WordBreak.
   */
  @Test
  public void testWordBreak() {
    System.out.println("wordBreak");
    String s = "abcdefg";
    String[] arr = {"bc", "cd", "de", "fg", "abcd", "efg"};
    Set<String> dict = new HashSet<String>(Arrays.asList(arr));
    WordBreak instance = new WordBreak();
    boolean expResult = false;
    boolean result = instance.wordBreak(s, dict);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

}
