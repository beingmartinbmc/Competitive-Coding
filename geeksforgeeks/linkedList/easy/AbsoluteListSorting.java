class GfG
{
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

    private Node merge(Node a, Node b){
        if(a == null) return b;
        if(b == null) return a;
        Node c = null;
        if(a.data <= b.data){
            c = a;
        }
        else{
            c = b;
            b = a;
            a = c;
        }
        while(a.next != null){
            if(a.next.data > b.data){
                Node temp = a.next;
                a.next = b;
                b = temp;
            }
            a = a.next;
        }
        a.next = b;
        return c;
    }
	public Node sortedList(Node head){
	    if(head == null || head.next == null) return head;
	    Node second = partition(head);
	    head = sortedList(head);
	    second = sortedList(second);
	    return merge(head, second);
	}
}
