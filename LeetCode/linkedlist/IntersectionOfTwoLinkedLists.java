public class Solution {
    private int getCount(ListNode head){
        ListNode current = head;
        int c = 0;
        while(current != null){
            c += 1;
            current = current.next;
        }
        return c;
    }
    public ListNode getIntersectionNode(ListNode a, ListNode b){
        int c = getCount(a), d = getCount(b);
        if(c == 0 || d == 0) return null;
        ListNode runnerOne = null, runnerTwo = null;
        ListNode biggerList = c > d ? a : b;
        ListNode smallerList = c <= d ? a : b;
        runnerOne = biggerList;
        runnerTwo = smallerList;
        for(int i=1; i<=Math.abs(c - d); i++) runnerOne = runnerOne.next;
        while(runnerOne != null && runnerTwo != null){
            if(runnerOne == runnerTwo) return runnerTwo;
            runnerOne = runnerOne.next;
            runnerTwo = runnerTwo.next;
        }
        return null;
    }
}
