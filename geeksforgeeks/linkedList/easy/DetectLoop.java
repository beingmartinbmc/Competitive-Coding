class GfG{
    public int detectLoop(Node head){
        if(head == null) return 0;
        Node fast = head, slow = head;
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return 1;
        }
        return 0;
    }
}
