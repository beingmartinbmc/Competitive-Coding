/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    private ListNode[] partition(ListNode head){
        if(head == null || head.next == null) return new ListNode[] {head, null};
        ListNode slow = head, fast = head.next;
        while(fast != null){
            fast = fast.next;
            if(fast != null){
                slow = slow.next;
                fast = fast.next;
            }
        }
        ListNode front = head, back = slow.next;
        slow.next = null;
        return new ListNode[] {front, back};
    }

    private ListNode merge(ListNode a, ListNode b){
        ListNode c = null;
        if(a == null) return b;
        if(b == null) return a;
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
    public ListNode sortList(ListNode A) {
        if(A == null || A.next == null) return A;
        ListNode[] output = partition(A);
        ListNode l = output[0];
        ListNode r = output[1];
        l = sortList(l);
        r = sortList(r);
        return merge(l, r);
    }
}
