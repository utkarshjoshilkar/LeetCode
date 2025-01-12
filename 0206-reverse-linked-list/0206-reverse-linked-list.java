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
    public ListNode reverseList(ListNode head) {
        ListNode oldHead = head;
        ListNode temp = head;
        head = null;
        while(oldHead != null){
            oldHead = oldHead.next;
            temp.next = head;
            head = temp;
            temp = oldHead ;
        }
        return head;
    }
}