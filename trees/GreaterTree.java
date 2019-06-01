class Solution {
    private int s = 0;
    private void transform(TreeNode root){
        if(root != null){
            transform(root.right);
            s += root.val;
            root.val = s;
            transform(root.left);
        }
    }
    public TreeNode convertBST(TreeNode root) {
        transform(root);
        return root;
    }
}
