package LeetCode.linkedlist;

class Solution {
    private ListNode head;
    private void reverse(ListNode prev, ListNode current){
        if(current != null){
            reverse(current, current.next);
            current.next = prev;
        }
        else head = prev;
    }
    public ListNode reverseList(ListNode node) {
        head = node;
        reverse(null, head);
        return head;
    }
}
