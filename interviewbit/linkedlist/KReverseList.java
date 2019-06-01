/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head, int k) {
        if(head == null) return null;
        ListNode current = head, next = null, prev = null;
        for(int i=0; i<k && current != null; i++){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        if(next != null) head.next = reverseList(next, k);
        return prev;
    }
}
