package geeksforgeeks.BST.medium;

class GFG {
    Node root = null;
    private void insert(int[] data){
        for(int i : data)
            root = insert(root, i);
    }
    private Node insert(Node node, int data){
        if(node == null){
            node = new Node(data);
            return node;
        }
        if(data < node.data)
            node.left = insert(node.left, data);
        else
            node.right = insert(node.right, data);
        return node;
    }
    public Node constructBST(int[] arr){
         insert(arr);
         return root;
    }
}
