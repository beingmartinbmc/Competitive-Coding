class GfG{
    private Node first = null, second = null, prev = null;

    private void swap(Node a, Node b){
        int t = a.data;
        a.data = b.data;
        b.data = t;
    }

    private Node getMorrisPred(Node current, Node target){
        while(current.right != null && current.right != target) current = current.right;
        return current;
    }

    private void segment(Node root){
        if(prev != null){
            if(prev.data > root.data){
                if(first == null) first = prev;
                second = root;
            }
        }
        prev = root;
    }

    private void inorder(Node root){
        Node current = root;
        while(current != null){
            if(current.left == null){
                segment(current);
                current = current.right;
            }
            else{
                Node pred = getMorrisPred(current.left, current);
                if(pred.right == null){
                    pred.right = current;
                    current = current.left;
                }
                else{
                    pred.right = null;
                    segment(current);
                    current = current.right;
                }
            }
        }
    }

    public Node correctBST(Node root){
        inorder(root);
        swap(first, second);
        return root;
    }
}
