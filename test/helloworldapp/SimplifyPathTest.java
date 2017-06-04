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
public class SimplifyPathTest {
  
  public SimplifyPathTest() {
  }

  /**
   * Test of simplifyPath method, of class SimplifyPath.
   */
  @Test
  public void testSimplifyPath() {
    System.out.println("simplifyPath");
    String path = "/a/./b/../../c/";
    SimplifyPath instance = new SimplifyPath();
    String expResult = "";
    String result = instance.simplifyPath(path);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
