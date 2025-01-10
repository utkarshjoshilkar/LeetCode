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
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> checker = new HashSet<>();
        ListNode current = head;

        if (head == null)
            return null;

        ListNode prev = null;
        while (current != null) {
            if(true!=checker.add(current.val)){
                prev.next = current.next; 
            }
            else{
                prev= current;
            }
            current = current.next;
        }
        return head;
    }
}