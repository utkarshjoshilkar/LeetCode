/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prevslow = head;
        if(head.next == null) return null;
        while (fast != null && fast.next != null) {
            prevslow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prevslow.next = slow.next ;
        slow.next = null;
        return head;
    }
}