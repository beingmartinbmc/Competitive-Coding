class GfG
{
    private boolean isLeaf(Node root){
        return root.left == null && root.right == null;
    }
    private void printLeaves(Node root){
        if (root == null) return;
        if(isLeaf(root)) System.out.print(root.data+" ");
        printLeaves(root.left);
        printLeaves(root.right);
    }
    private void printLeft(Node root){
        if (root == null || isLeaf(root)) return;
        System.out.print(root.data+" ");
        printLeft(root.left != null ? root.left : root.right);
    }
    private void printRight(Node root){
        if (root == null || isLeaf(root)) return;
        printRight(root.right != null ? root.right : root.left);
        System.out.print(root.data+" ");
    }
	void printBoundary(Node node){
	    if (node == null) return;
	    System.out.print(node.data+" ");
	    printLeft(node.left);
	    printLeaves(node);
	    printRight(node.right);
	}
}
