class GfG {
    private Node partition(Node head){
        if(head == null || head.next == null) return head;
        Node slow = head, fast = head.next;
        while(fast != null){
            fast = fast.next;
            if(fast != null){
                slow = slow.next;
                fast = fast.next;
            }
        }
        Node second = slow.next;
        slow.next = null;
        return second;
    }

    private Node reverse(Node head){
        Node current = head, next = null, prev = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    private void merge(Node a, Node b){
        Node p1 = a;
        Node p2 = b;
        while(p2 != null){
            Node t1 = p1.next;
            Node t2 = p2.next;
            p1.next = p2;
            p2.next = t1;
            p1 = t1;
            p2 = t2;
        }
    }
    public Node rearrange(Node head){
       if(head == null || head.next == null) return head;
       Node second = partition(head);
       second = reverse(second);
       merge(head, second);
       return head;
    }
}
