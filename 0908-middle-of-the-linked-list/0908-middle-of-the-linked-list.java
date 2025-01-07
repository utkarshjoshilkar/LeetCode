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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int counter = 0;
        if (head == null)
            return null;

        if (head.next == null) {
            return head;
        }

        while (temp != null) {
            counter++;
            temp = temp.next;
        }

        temp = head;
        if (counter / 2 == 0) {
            for (int i = 0; i < (counter / 2) + 1; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            for (int i = 0; i < counter / 2; i++) {
                temp = temp.next;
            }
            return temp;
        }
    }
}