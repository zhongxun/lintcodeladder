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
public class RestoreIPAddressesTest {
  
  public RestoreIPAddressesTest() {
  }

  /**
   * Test of restoreIpAddresses method, of class RestoreIPAddresses.
   */
  @Test
  public void testRestoreIpAddresses() {
    System.out.println("restoreIpAddresses");
    String s = "0000";
    RestoreIPAddresses instance = new RestoreIPAddresses();
    ArrayList<String> expResult = null;
    ArrayList<String> result = instance.restoreIpAddresses(s);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
