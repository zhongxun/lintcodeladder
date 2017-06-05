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
public class PartitionList {

    public ListNode partition(ListNode head, int x) {
        // write your code here

        ListNode smallerDummy = new ListNode(0);
        ListNode smallerTail = smallerDummy;
        ListNode largerDummy = new ListNode(0);
        ListNode largerTail = largerDummy;
        ListNode curt = head;

        while (curt != null) {
            if (curt.val >= x) {
                largerTail.next = curt;
                largerTail = curt;
            } else {
                smallerTail.next = curt;
                smallerTail = curt;
            }

            curt = curt.next;
        }

        largerTail.next = null;
        smallerTail.next = largerDummy.next;

        return smallerDummy.next;
    }
}
