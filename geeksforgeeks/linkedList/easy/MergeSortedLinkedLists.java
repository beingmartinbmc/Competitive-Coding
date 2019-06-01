class gfg
{
    Node MergeLists(Node a, Node b) {
        Node result = null;
        if(a == null) return b;
        if(b == null) return a;
        if(a.data <= b.data){
            result = a;
            result.next = MergeLists(a.next, b);
        }
        else{
            result = b;
            result.next = MergeLists(a, b.next);
        }
        return result;
   }
}
