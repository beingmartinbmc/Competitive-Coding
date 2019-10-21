package LeetCode.trees;

class Solution {
    private int sum = Integer.MIN_VALUE;
    private int maxSum(TreeNode root){
        if(root == null) return 0;
        int left = maxSum(root.left);
        int right = maxSum(root.right);
        int current = Math.max(root.val, Math.max(left, right) + root.val);
        sum = Math.max(sum, Math.max(current, left + right+ root.val));
        return current;
    }
    public int maxPathSum(TreeNode root) {
        maxSum(root);
        return sum;
    }
}
