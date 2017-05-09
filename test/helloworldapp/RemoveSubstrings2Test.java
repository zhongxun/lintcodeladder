/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author v-xuzhon
 */
public class RemoveSubstrings2Test {
  
  public RemoveSubstrings2Test() {
  }

  /**
   * Test of minLength method, of class RemoveSubstrings2.
   */
  @Test
  public void testMinLength() {
    System.out.println("minLength");
        String s = "ccdaabcdbb";
        Set<String> dict = new HashSet<String>();
        dict.add("ab");
        dict.add("cd");
    RemoveSubstrings2 instance = new RemoveSubstrings2();
    int expResult = 2;
    int result = instance.minLength(s, dict);
    assertEquals(expResult, result);

  }
  
}
