/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slowpointer = head;
        ListNode fastpointer = head;
        while(fastpointer != null && fastpointer.next != null){
            slowpointer = slowpointer.next;
            fastpointer = fastpointer.next.next;
            if(slowpointer == fastpointer){
                ListNode sp = head;
                while(sp != slowpointer){
                    sp = sp.next;
                    slowpointer = slowpointer.next;
                }
                return sp;
            }
        }
        return null;
    }
}