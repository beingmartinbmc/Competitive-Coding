package LeetCode.linkedlist;

class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null) return head;
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode prev = newHead;
        for(int i= 1; i<= (m-1); i++) prev = prev.next;
        final ListNode reversed = prev;
        prev = prev.next;
        ListNode current = prev.next;
        for(int i=m; i<=(n-1); i++){
            prev.next = current.next;
            current.next = reversed.next;
            reversed.next = current;
            current = prev.next;
        }
        return newHead.next;
    }
}
