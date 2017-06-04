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
public class EvaluateReversePolishNotationTest {

  public EvaluateReversePolishNotationTest() {
  }

  /**
   * Test of evalRPN method, of class EvaluateReversePolishNotation.
   */
  @Test
  public void testEvalRPN() {
    System.out.println("evalRPN");
    String[] tokens = {"0", "3", "/"};
    EvaluateReversePolishNotation instance = new EvaluateReversePolishNotation();
    int expResult = 0;
    int result = instance.evalRPN(tokens);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

}
