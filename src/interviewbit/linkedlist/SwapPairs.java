package interviewbit.linkedlist;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode current = head, prev = null;
        while(current != null && current.next != null){
            ListNode next = current.next;
            current.next = next.next;
            next.next = current;
            if(prev == null) head = next;
            else prev.next = next;
            prev = current;
            current = current.next;
        }
        return head;
    }
}
