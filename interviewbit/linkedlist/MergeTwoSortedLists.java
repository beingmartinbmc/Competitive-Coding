/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode c = null;
        if(a == null) return b;
        if(b == null) return a;
        if(a.val <= b.val) c = a;
        else{
            c = b;
            b = a;
            a = c;
        }
        while(a.next != null){
            if(a.next.val > b.val){
                ListNode temp = a.next;
                a.next = b;
                b = temp;
            }
            a = a.next;
        }
        a.next = b;
        return c;
    }
}
