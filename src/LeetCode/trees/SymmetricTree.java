package LeetCode.trees;

class Solution {
    private boolean areSame(TreeNode a, TreeNode b){
        if(a == null && b == null) return true;
        else if(a == null || b == null) return false;
        return (a.val == b.val) && (areSame(a.left, b.right)) && areSame(a.right, b.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return areSame(root, root);
    }
}
