class GFG
{
    private int countNodes(Node node){
        Node temp = node;
        int count = 1;
        while(temp.next != node){
            count += 1;
            temp = temp.next;
        }
        return count;
    }
    public int countNodesinLoop(Node head){
        Node fast = head, slow = head;
        while(fast != null && fast.next != null && slow != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return countNodes(slow);
        }
        return 0;
    }
}
