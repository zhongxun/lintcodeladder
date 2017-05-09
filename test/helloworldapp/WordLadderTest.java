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
public class WordLadderTest {
  
  public WordLadderTest() {
  }

  /**
   * Test of ladderLength method, of class WordLadder.
   */
  @Test
  public void testLadderLength() {
    System.out.println("ladderLength");
    String start = "a";
    String end = "c";
    Set<String> dict = new HashSet<String>(Arrays.asList(new String[]{"a","b","c"}));
    WordLadder instance = new WordLadder();
    int expResult = 2;
    int result = instance.ladderLength(start, end, dict);
    assertEquals(expResult, result);
  } 
}
