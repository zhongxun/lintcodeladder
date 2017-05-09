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
public class BinaryTreeSerializationTest {
  
  public BinaryTreeSerializationTest() {
  }

  /**
   * Test of serialize method, of class BinaryTreeSerialization.
   */
  @Test
  public void testSerialize() {
    System.out.println("serialize");
    TreeNode root = null;
    BinaryTreeSerialization instance = new BinaryTreeSerialization();
    String expResult = "";
    String result = instance.serialize(root);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of deserialize method, of class BinaryTreeSerialization.
   */
  @Test
  public void testDeserialize() {
    System.out.println("deserialize");
    String data = "1,#,2";
    BinaryTreeSerialization instance = new BinaryTreeSerialization();
    TreeNode expResult = null;
    TreeNode result = instance.deserialize(data);
    String s = instance.serialize(result);
    result = instance.deserialize(s);
    assertEquals(expResult, result);
  }
  
}
