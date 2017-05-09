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
public class TrappingRainWaterTest {

  public TrappingRainWaterTest() {
  }

  /**
   * Test of trapRainWater method, of class TrappingRainWater.
   */
  @Test
  public void testTrapRainWater() {
    System.out.println("trapRainWater");
    int[] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    TrappingRainWater instance = new TrappingRainWater();
    int expResult = 0;
    int result = instance.trapRainWater(heights);
    assertEquals(expResult, result);
  }

}
