package geeksforgeeks.linkedList.easy;

class GfG
{
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
    public Node mergeResult(Node a, Node b){
        if(a == null) return b;
        if(b == null) return a;
        Node c = null;
        if(a.data <= b.data) c = a;
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
        return reverse(c);
    }
}
