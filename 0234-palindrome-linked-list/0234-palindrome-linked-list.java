/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer>List = new ArrayList<>();
        ListNode current = head;
        while(current != null){
            List.add(current.val);
            current = current.next;
        }
        int left = 0;
        int right = List.size() - 1;
        while(left < right){
            if(!List.get(left).equals(List.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}