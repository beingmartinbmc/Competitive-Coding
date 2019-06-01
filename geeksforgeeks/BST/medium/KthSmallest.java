class gfg2{
    private int[] x;
    private int p =0;

    private int getSize(Node root){
        if(root == null) return 0;
        return getSize(root.left) + getSize(root.right) + 1;
    }

    private void initialise(Node root){
        int size = getSize(root);
        x = new int[size];
    }

    private void inorder(Node root){
        if(root != null){
            inorder(root.left);
            x[p++] = root.data;
            inorder(root.right);
        }
    }

    public static int kthSmallest(Node root,int k){
        gfg2 bst = new gfg2();
        bst.initialise(root);
        bst.inorder(root);
        return bst.x[k - 1];
    }
}
