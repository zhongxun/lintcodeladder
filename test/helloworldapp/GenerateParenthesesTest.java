/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author v-xuzhon
 */
public class GenerateParenthesesTest {
  
  public GenerateParenthesesTest() {
  }

  /**
   * Test of generateParenthesis method, of class GenerateParentheses.
   */
  @Test
  public void testGenerateParenthesis() {
    System.out.println("generateParenthesis");
    int n = 3;
    GenerateParentheses instance = new GenerateParentheses();
    ArrayList<String> expResult = null;
    ArrayList<String> result = instance.generateParenthesis(n);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
