package interviewbit.trees;

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    private boolean areSame(TreeNode a, TreeNode b){
        if(a == null && b == null) return true;
        else if(a == null || b == null) return false;
        return a.val == b.val && areSame(a.left, b.left) && areSame(a.right, b.right);
    }
    public int isSameTree(TreeNode A, TreeNode B) {
        return areSame(A, B) ? 1 : 0;
    }
}
