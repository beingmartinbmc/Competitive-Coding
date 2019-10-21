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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int c = 1;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            c += 1;
        }
        k = c - (k % c);
        temp.next = head;
        for(int i=1; i <= k ; i++) temp = temp.next;
        head = temp.next;
        temp.next = null;
        return head;
    }
}
