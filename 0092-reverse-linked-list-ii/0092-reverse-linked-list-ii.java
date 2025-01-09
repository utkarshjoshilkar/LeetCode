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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = head;
        Stack<Integer> stack = new Stack<>();
        if(head == null) return null;
        if(left == right) return head;
        for (int i = 1; i < left; i++) {
            temp = temp.next;
        }
        for (int j = left; j <= right; j++) {
            stack.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        for(int i=1 ; i<= right ;i++){
            if(i >= left){
                temp.val = stack.pop();
            }
            temp = temp.next;
        }
        return head;
    }
}