/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    private void reverse(ListNode head){
        ListNode next = null, current = head, prev = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    private ListNode merge(ListNode a, ListNode b){
        ListNode p1 = a;
        ListNode p2 = b;
        while(p2 != null){
            ListNode t1 = p1.next;
            ListNode t2 = p2.next;
            p1.next = p2;
            p2.next = t1;
            p1 = t1;
            p2 = t2;
        }
        return a;
    }

    private ListNode partition(ListNode head){
        ListNode front = null, back = null;
        ListNode fast= head, slow = head;
        while(fast != null){
            fast = fast.next;
            if(fast != null){
                slow = slow.next;
                fast = fast.next;
            }
        }
        front = head;
        back = slow.next;
        slow.next = null;
        return back;
    }

    public ListNode reorderList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode second = partition(head);
        reverse(second);
        head = merge(head, second);
        return head;
    }
}
