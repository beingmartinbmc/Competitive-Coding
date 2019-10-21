package LeetCode.linkedlist;

class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        ListNode sS = new ListNode(0), gS = new ListNode(0);
        ListNode sE = sS, gE = gS;
        while(head != null){
            if(head.val < x){
                sE.next = head;
                head = head.next;
                sE = sE.next;
                sE.next = null;
            }
            else{
                gE.next = head;
                head = head.next;
                gE = gE.next;
                gE.next = null;
            }
        }
        sE.next = gS.next;
        return sS.next;
    }
}
