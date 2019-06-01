class GfG
{
    private boolean isLeaf(Node root){
        return root.left == null && root.right == null;
    }
    private Node getMax(Node root){
        Node current = root;
        while(current.right != null)
            current = current.right;
        return current;
    }
    private Node delete(Node root, int data){
        if(root == null) return root;
        if(data < root.key) root.left = delete(root.left, data);
        else if(data > root.key) root.right = delete(root.right, data);
        else{
            if(isLeaf(root)) root = null;
            else if(root.left == null) root = root.right;
            else if(root.right == null) root = root.left;
            else{
                Node temp = getMax(root.left);
                root.key = temp.key;
                root.left = delete(root.left, temp.key);
            }
        }
        return root;
    }
    Node deleteNode(Node root, int key) {
        return delete(root, key);
    }
}
