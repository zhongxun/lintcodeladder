/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author v-xuzhon
 */
public class DivTest {
    
    public DivTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of div method, of class Div.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        int A = 7;
        int B = 3;
        Div instance = new Div();
        int expResult = 2;
        int result = instance.div(A, B);
        assertEquals(expResult, result);
        assertEquals(-2, instance.div(-7, 3));
        assertEquals(2, instance.div(-7, -3));
        assertEquals(11, instance.div(100, 9));
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of Test method, of class Div.
     */
    @Test
    public void testTest() {
        System.out.println("Test");
        Div.Test();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class Div.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int dividend = 100;
        int divisor = 9;
        Div instance = new Div();
        int expResult = 11;
        int result = instance.divide(dividend, divisor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
