/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> checker = new HashSet<>();
        ListNode current = head;
        if(head == null)  return null;   
        while(current!= null){
            if(true != checker.add(current))
                return current;
            current = current.next;
        }  
        return null;
    }
}