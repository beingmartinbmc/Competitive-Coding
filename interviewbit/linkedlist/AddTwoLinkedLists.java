/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode a, ListNode b) {
        int carry = 0;
        ListNode result = null, temp = null, prev = null;
        while(a != null || b != null){
            int sum = carry + (a != null ? a.val : 0) + (b != null ? b.val : 0);
            carry = sum >= 10 ? 1 : 0;
            sum %= 10;
            temp = new ListNode(sum);
            if(result == null) result = temp;
            else prev.next = temp;
            prev = temp;
            a = a != null ? a.next : null;
            b = b != null ? b.next : null;
        }
        if(carry == 1) temp.next = new ListNode(carry);
        return result;
    }
}
