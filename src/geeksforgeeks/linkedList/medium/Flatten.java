package geeksforgeeks.linkedList.medium;

class GfG
{
    private Node merge(Node a, Node b){
        Node c = null;
        if(a == null) return b;
        if(b == null) return a;
        if(a.data <= b.data){
            c = a;
            c.bottom = merge(a.bottom, b);
        }
        else{
            c = b;
            c.bottom = merge(a, b.bottom);
        }
        return c;
    }

    public Node flatten(Node root){
        if(root == null || root.next == null) return root;
        return merge(root, flatten(root.next));
    }
}
