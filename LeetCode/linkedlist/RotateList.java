class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) return head;
        int counter = 1;
        ListNode runner = head;
        while(runner.next != null){
            counter += 1;
            runner = runner.next;
        }
        runner.next = head;
        k = counter - k % counter;
        for(int i=0; i<k; i++) runner = runner.next;
        head = runner.next;
        runner.next = null;
        return head;
    }
}
