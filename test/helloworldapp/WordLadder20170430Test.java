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
public class WordLadder20170430Test {

  public WordLadder20170430Test() {
  }

  /**
   * Test of ladderLength method, of class WordLadder20170430.
   */
  @Test
  public void testLadderLength() {
    System.out.println("ladderLength");
    String start = "a";
    String end = "c";
    String[] arr = {"a", "b", "c"};
    Set<String> dict = new HashSet<String>(Arrays.asList(arr));
//    Set<String> dict = new HashSet<>({""});
    WordLadder20170430 instance = new WordLadder20170430();
    int expResult = 0;
    int result = instance.ladderLength(start, end, dict);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

}
