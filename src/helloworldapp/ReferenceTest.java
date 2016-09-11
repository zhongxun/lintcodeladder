/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author v-xuzhon
 */
public class ReferenceTest {
    public static void Test() {
        ReferenceTest r = new ReferenceTest();        
        Integer i = 10;        
        
        r.Call(i);        
    
        System.out.println(i);
    }
    
    public void Call(Integer i) {
        i += 10;
    }
}