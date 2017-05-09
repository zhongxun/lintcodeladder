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
public class GraphValidTreeTest {
  
  public GraphValidTreeTest() {
  }

  /**
   * Test of validTree method, of class GraphValidTree.
   */
  @Test
  public void testValidTree() {
    System.out.println("validTree");
    int n = 5;
    int[][] edges = new int[][] {{0,1},{0,2},{0,3},{1,4}};
    GraphValidTree instance = new GraphValidTree();
    boolean expResult = true;
    boolean result = instance.validTree(n, edges);
    assertEquals(expResult, result);
  }
  
}
