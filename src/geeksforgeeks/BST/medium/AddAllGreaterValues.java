package geeksforgeeks.BST.medium;

class GfG
{
    private int sum = 0;
    private void reverseInorder(Node root){
        if(root != null){
            reverseInorder(root.right);
            sum += root.data;
            root.data = sum;
            reverseInorder(root.left);
        }
    }
    void modify(Node root){
        reverseInorder(root);
    }
}
