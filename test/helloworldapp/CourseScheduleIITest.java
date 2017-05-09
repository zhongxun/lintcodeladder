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
public class CourseScheduleIITest {

  public CourseScheduleIITest() {
  }

  /**
   * Test of findOrder method, of class CourseScheduleII.
   */
  @Test
  public void testFindOrder() {
    System.out.println("findOrder");
    int numCourses = 4;
    int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
    CourseScheduleII instance = new CourseScheduleII();
    int[] expResult = {0, 2, 1, 3};
    int[] result = instance.findOrder(numCourses, prerequisites);
    System.out.println("++++++++++++++++++++++");
//    System.out.println(expResult.);
    assertArrayEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
  }

}
