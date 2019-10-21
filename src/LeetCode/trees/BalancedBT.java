package LeetCode.trees;

class Solution {
    private int checkBalance(TreeNode root){
        if(root == null) return 0;
        int left = checkBalance(root.left);
        int right = checkBalance(root.right);
        return (left == -1 || right == -1 || Math.abs(left - right) > 1) ? -1 : Math.max(left, right) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        return checkBalance(root) != -1;
    }
}
