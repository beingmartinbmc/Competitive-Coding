package interviewbit.linkedlist;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    private ListNode partition(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode slow = head, fast = head.next;
        while(fast != null){
            fast = fast.next;
            if(fast != null){
                slow = slow.next;
                fast = fast.next;
            }
        }
        ListNode second = slow.next;
        slow.next = null;
        return second;
    }

    private ListNode reverse(ListNode head){
        ListNode current = head, prev = null, next = null;
        while(current != null){
            next  = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public int lPalin(ListNode head) {
        if(head == null || head.next == null) return 1;
        ListNode second = partition(head);
        second = reverse(second);
        ListNode tempOne = head, tempTwo = second;
        while(tempOne != null && tempTwo != null){
            if(tempOne.val != tempTwo.val) return 0;
            tempOne = tempOne.next;
            tempTwo = tempTwo.next;
        }
        return 1;
    }
}
