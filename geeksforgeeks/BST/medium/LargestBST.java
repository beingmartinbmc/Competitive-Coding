class GfG{
    private boolean isBST(Node root, int min, int max){
        if(root == null) return true;
        if(root.data < min || root.data > max) return false;
        return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
    }

    private boolean isBST(Node root){
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private int getSize(Node root){
        if(root == null) return 0;
        return getSize(root.left) + getSize(root.right) + 1;
    }

    private int getLargestBST(Node root){
        if(root == null) return 0;
        if(isBST(root)) return getSize(root);
        return Math.max(getLargestBST(root.left), getLargestBST(root.right));
    }

    public int largestBst(Node node){
        int result = getLargestBST(node);
        System.out.println(result);
        return result;
    }
}
