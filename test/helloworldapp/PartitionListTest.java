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
public class PartitionListTest {
    
    public PartitionListTest() {
    }

    /**
     * Test of partition method, of class PartitionList.
     */
    @Test
    public void testPartition() {
        System.out.println("partition");
        ListNode head = ListNode.DeSerialize("1->4->3->2->5->2->null");
        int x = 3;
        PartitionList instance = new PartitionList();
        ListNode expResult = null;
        ListNode result = instance.partition(head, x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
