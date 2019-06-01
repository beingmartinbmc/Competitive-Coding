class GfG
{
    private boolean isLeaf(Node root){
        return root.left == null && root.right == null;
    }
    private int getCount(Node root){
        if(root == null) return 0;
        if(isLeaf(root)) return 1;
        return getCount(root.left) + getCount(root.right);
    }
    int countLeaves(Node node) {
         return getCount(node);
    }
}
