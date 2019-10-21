package LeetCode.arrays;

class AVL{
    private class Node{
        int data;
        int height;
        int size;
        int frequency;
        Node left, right;

        Node(int data){
            this.data = data;
            this.height = 1;
            this.frequency = 1;
            this.size = 1;
            left = right = null;
        }
    }

    private Node root;
    private List<Integer> c;

    private int getHeight(Node root){
        return root == null ? 0 : root.height;
    }

    private int getSize(Node root){
        return root == null ? 0 : root.size;
    }

    private int getBF(Node root){
        return root == null ? 0 : getHeight(root.left) - getHeight(root.right);
    }
    
    private void updateSize(Node node) {
        node.size = (node == null) ? 0 : node.frequency + getSize(node.left) + getSize(node.right);
    }
    
    private void updateHeight(Node node){
        node.height = (node == null) ? - 1: 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }

    private void updateNode(Node root){
        updateSize(root);
        updateHeight(root);
    }

    private Node rotateRight(Node A){
        Node B = A.left;
        Node T2 = B.right;
        B.right = A;
        A.left = T2;
        updateNode(A);
        updateNode(B);
        return B;
    }

    private Node rotateLeft(Node A){
        Node B = A.right;
        Node T2 = B.left;
        B.left = A;
        A.right = T2;
        updateNode(A);
        updateNode(B);
        return B;
    }

    private void insert(int data, int index){
        root = insert(root, data, index);
    }

    private Node insert(Node root, int data, int i){
        if(root == null) return new Node(data);
        root.size++;
        if(root.data == data){
            root.frequency++;
            c.set(i, c.get(i) + getSize(root.left));
        }
        else if(data < root.data) root.left = insert(root.left, data, i);
        else{
            root.right = insert(root.right, data, i);
            c.set(i, c.get(i) + getSize(root.left) + root.frequency);
        }
        return balance(root, data);
    }
    
    
    private Node balance(Node root, int data){
        updateNode(root);
        int bf = getBF(root);
        if(bf > 1){
            if(getBF(root.left) >= 0) root = rotateRight(root);
            else{
                root.left = rotateLeft(root.left);
                root = rotateRight(root);
            }
        }
        if(bf < -1){
            if(getBF(root.right) <= 0) root = rotateLeft(root);
            else{
                root.right = rotateRight(root.right);
                root = rotateLeft(root);
            }
        }
        return root;
    }
    
    public List<Integer> fillEntries(int[] a){
        c = new ArrayList<Integer>(Collections.nCopies(a.length, 0));
        for(int i=a.length-1; i >= 0; i--) insert(a[i], i);
        return c;
    }

}

class Solution {
    public List<Integer> countSmaller(int[] nums) {
        AVL tree = new AVL();
        List<Integer> output = tree.fillEntries(nums);
        return output;
    }
}
