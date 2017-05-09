/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author v-xuzhon
 */
public class WordBreakIITest {

  public WordBreakIITest() {
  }

  /**
   * Test of wordBreak method, of class WordBreakII.
   */
  @Test
  public void testWordBreak() {
    System.out.println("wordBreak");
    String s = "lintcode";
    Set<String> wordDict = new HashSet<String>(
            Arrays.asList(
                    new String[]{"de", "ding", "co", "code", "lint"}
            )
    );
    WordBreakII instance = new WordBreakII();
    List<String> expResult = null;
    List<String> result = instance.wordBreak(s, wordDict);
    assertEquals(expResult, result);
  }

}
