public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head.next, fast = head.next.next;
        while(fast != null && fast.next != null){
            if(slow == fast) break;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow != fast) return null;
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
