class GfG
{
    private boolean isLeaf(Node root){
        return root.left == null && root.right == null;
    }
    private boolean isFull(Node root){
        if(root == null || isLeaf(root)) return true;
        if(root.left != null && root.right != null)
            return isFull(root.left) && isFull(root.right);
        return false;
    }
	boolean isFullTree(Node node){
        return isFull(node);
    }
}
