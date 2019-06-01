class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null && n == 1) return null;
        ListNode last = head, first = head;
        for(int i=1; i<=n-1; i++) last = last.next;
        ListNode prev = null;
        while(last.next != null){
            prev = first;
            first = first.next;
            last = last.next;
        }
        if(first == head){
            head = head.next;
            return head;
        }
        prev.next = first.next;
        return head;
    }
}
