package geeksforgeeks.BST.hard;

class GfG{
    private int getHeight(Node root){
        if(root == null) return 0;
        return root.height;
    }

    private void updateHeight(Node root){
        root.height = Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    private int getBF(Node root){
        if(root == null) return 0;
        return getHeight(root.left) - getHeight(root.right);
    }

    private Node rotateRight(Node A){
        Node B = A.left;
        Node T2 = B.right;
        B.right = A;
        A.left = T2;
        updateHeight(A);
        updateHeight(B);
        return B;
    }

    private Node rotateLeft(Node A){
        Node B = A.right;
        Node T2 = B.left;
        B.left = A;
        A.right = T2;
        updateHeight(A);
        updateHeight(B);
        return B;
    }


    private Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }
        else if(root.data > data) root.left = insert(root.left, data);
        else root.right = insert(root.right, data);
        updateHeight(root);
        int bf = getBF(root);
        if(bf > 1 && data < root.left.data)
            root = rotateRight(root);
        if(bf < -1 && data > root.right.data)
            root = rotateLeft(root);
        if(bf > 1 && data > root.left.data){
            root.left = rotateLeft(root.left);
            root = rotateRight(root);
        }
        if(bf < -1 && data < root.right.data){
            root.right = rotateRight(root.right);
            root = rotateLeft(root);
        }
        return root;
    }
    public Node insertToAVL(Node node,int data){
         return insert(node, data);
    }
}
