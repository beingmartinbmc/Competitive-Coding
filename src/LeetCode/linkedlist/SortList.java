package LeetCode.linkedlist;

class Solution {
    private ListNode partition(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode slow = head, fast = head.next;
        while(fast != null){
            fast = fast.next;
            if(fast != null){
                slow = slow.next;
                fast =fast.next;
            }
        }
        ListNode second = slow.next;
        slow.next = null;
        return second;
    }
    private ListNode merge(ListNode a, ListNode b){
        if(a == null) return b;
        if(b == null) return a;
        ListNode c = null;
        if(a.val <= b.val) c = a;
        else{
            c = b;
            b = a;
            a = c;
        }
        while(a.next != null){
            if(a.next.val > b.val){
                ListNode temp = a.next;
                a.next = b;
                b = temp;
            }
            a = a.next;
        }
        a.next = b;
        return c;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode l = partition(head);
        head = sortList(head);
        l = sortList(l);
        return merge(head, l);
    }
}
