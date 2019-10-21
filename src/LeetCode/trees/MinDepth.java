package LeetCode.trees;

class Solution {
    private int depth(TreeNode root){
        if(root == null) return Integer.MAX_VALUE;
        if(root.left == null && root.right == null) return 1;
        return Math.min(depth(root.left), depth(root.right)) + 1;
    }
    public int minDepth(TreeNode root) {
        return root == null ? 0 : depth(root);
    }
}
