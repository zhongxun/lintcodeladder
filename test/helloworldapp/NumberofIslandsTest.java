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
public class NumberofIslandsTest {
  
  public NumberofIslandsTest() {
  }

  /**
   * Test of numIslands method, of class NumberofIslands.
   */
  @Test
  public void testNumIslands() {
    System.out.println("numIslands");
    boolean[][] grid =   {
 {true,true,false,false,false}, 
 {false,true,false,false,true}, 
 {false,false,false,true,true}, 
 {false,false,false,false,false}, 
 {false,false,false,false,true} 
 };
    NumberofIslands instance = new NumberofIslands();
    int expResult = 3;
    int result = instance.numIslands(grid);
    assertEquals(expResult, result);
  }
  
}
