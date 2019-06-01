class Solution {
    private boolean isLeaf(TreeNode root){
        return root.left == null && root.right == null;
    }
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        if(isLeaf(root)) return root.val  == sum;
        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }
}
