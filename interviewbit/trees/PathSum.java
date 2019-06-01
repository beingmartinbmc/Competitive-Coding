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
    private boolean isLeaf(TreeNode root){
        return root.left == null && root.right == null;
    }
    private boolean hasSum(TreeNode root, int sum){
        if(root == null) return false;
        if(isLeaf(root)){
            if(root.val == sum) return true;
            else return false;
        }
        return hasSum(root.left, sum-root.val) || hasSum(root.right, sum-root.val);
    }
    public int hasPathSum(TreeNode A, int B) {
        return hasSum(A, B) ? 1 : 0;
    }
}
