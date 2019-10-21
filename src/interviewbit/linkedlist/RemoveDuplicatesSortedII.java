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
    public ListNode deleteDuplicates(ListNode A) {
        ListNode dummy = new ListNode(-1);
        dummy.next = A;
        ListNode current = A, prev = dummy;
        while(current != null){
            while(current.next != null && prev.next.val == current.next.val) current = current.next;
            if(prev.next == current) prev = prev.next;
            else prev.next = current.next;
            current = current.next;
        }
        return dummy.next;
    }
}
