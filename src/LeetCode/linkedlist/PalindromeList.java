package LeetCode.linkedlist;

class Solution {
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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode second = partition(head);
        second = reverse(second);
        ListNode tempOne = head, tempTwo = second;
        while(tempOne != null && tempTwo != null){
            if(tempOne.val != tempTwo.val) return false;
            tempOne = tempOne.next;
            tempTwo = tempTwo.next;
        }
        return true;
    }
}
