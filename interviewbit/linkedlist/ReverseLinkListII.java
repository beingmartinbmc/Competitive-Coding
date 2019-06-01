/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null) return head;
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode prev = null;
        int i = 0;
        for(i = 1, prev = newHead; i <= (m - 1); prev = prev.next, i ++)
        ListNode reversed = prev;
        prev = prev.next;
        ListNode current = prev.next;
        for(i=m; i<=n-1; i++){
            prev.next = current.next;
            current.next = reversed.next;
            reversed.next = current;
            current = prev.next;
        }
        return newHead.next;
    }
}
