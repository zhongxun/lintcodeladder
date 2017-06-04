/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author v-xuzhon
 */
public class LetterCombinationsofaPhoneNumberTest {
  
  public LetterCombinationsofaPhoneNumberTest() {
  }

  /**
   * Test of letterCombinations2 method, of class LetterCombinationsofaPhoneNumber.
   */
  @Test
  public void testLetterCombinations2() {
    System.out.println("letterCombinations2");
    String digits = "";
    LetterCombinationsofaPhoneNumber instance = new LetterCombinationsofaPhoneNumber();
    ArrayList<String> expResult = null;
    ArrayList<String> result = instance.letterCombinations2(digits);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of letterCombinations method, of class LetterCombinationsofaPhoneNumber.
   */
  @Test
  public void testLetterCombinations() {
    System.out.println("letterCombinations");
    String digits = "23";
    LetterCombinationsofaPhoneNumber instance = new LetterCombinationsofaPhoneNumber();
    List<String> expResult = null;
    List<String> result = instance.letterCombinations(digits);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
