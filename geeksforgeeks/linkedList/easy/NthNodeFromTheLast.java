class GfG{
    public int getNthFromLast(Node head, int n){
        Node p = head, f = head;
        for(int i=1; i<=n-1; i++){
            f = f.next;
            if(f == null) return -1;
        }
        while(f.next != null){
            p = p.next;
            f = f.next;
        }
        return p.data;
    }
}
