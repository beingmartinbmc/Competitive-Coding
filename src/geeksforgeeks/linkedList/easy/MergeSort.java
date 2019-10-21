package geeksforgeeks.linkedList.easy;

class GfG{
    public Node mergeList(Node a, Node b){
        if(a == null) return b;
        if(b == null) return a;
        Node c = null;
        if(a.data <= b.data){
            c = a;
            c.next = mergeList(a.next, b);
        }
        else{
            c = b;
            c.next = mergeList(a, b.next);
        }
        return c;
    }
    public Node splitList(Node source){
        if(source == null || source.next == null) return source;
        Node fast = source.next, slow = source;
        while(fast != null){
            fast = fast.next;
            if(fast != null){
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }
}
