class Solution {
    public ListNode middleNode(ListNode head) {
       if(head == null || head.next == null) return head;
       ListNode slow = head.next, fast = head.next.next;
       while(fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
       }
        return slow;
    }
}
