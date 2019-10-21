package interviewbit.linkedlist;

public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        ListNode lHead = new ListNode(-1), rHead = new ListNode(-1);
        ListNode lEnd = lHead, rEnd = rHead;
        while(head != null){
            if(head.val < x){
                lEnd.next = head;
                lEnd = head;
            }
            else{
                rEnd.next = head;
                rEnd = head;
            }
            head = head.next;
            lEnd.next = null;
            rEnd.next = null;
        }
        lEnd.next = rHead.next;
        return lHead.next;
    }
}
