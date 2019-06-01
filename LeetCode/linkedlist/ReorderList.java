class Solution {
    private ListNode reverse(ListNode head){
        ListNode current = head, next = null, prev = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    private ListNode[] partition(ListNode head){
        ListNode slow = head, fast = head.next;
        while(fast != null){
            fast= fast.next;
            if(fast != null){
                slow = slow.next;
                fast = fast.next;
            }
        }
        ListNode front = head, back = slow.next;
        slow.next = null;
        return new ListNode[]{front, back};
    }

    private void merge(ListNode a, ListNode b){
        ListNode p1 = a;
        ListNode p2 = b;
        while(p2 != null){
            ListNode t1 = p1.next;
            ListNode t2 = p2.next;
            p1.next = p2;
            p2.next = t1;
            p1 = t1;
            p2 = t2;
        }
    }
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode[] output = partition(head);
        head = output[0];
        ListNode second = output[1];
        second = reverse(second);
        merge(head, second);
    }
}
