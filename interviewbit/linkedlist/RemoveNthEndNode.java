public class Solution {
    public ListNode removeNthFromEnd(ListNode a, int n) {
        if(a.next == null && n == 1) return null;
        ListNode f = a, p = a;
        ListNode prev = null;
        for(int i=1; i<=n && f != null; i++)  f = f.next;
        while(f != null){
            prev = p;
            p = p.next;
            f = f.next;
        }
        if(p == a) return a.next;
        prev.next = p.next;
        return a;
    }
}
