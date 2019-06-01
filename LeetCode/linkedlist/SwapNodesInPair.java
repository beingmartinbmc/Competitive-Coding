class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode q = head.next;
        ListNode temp = q.next;
        q.next = head;
        head.next = swapPairs(temp);
        return q;
    }
}
