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
    private int checkHeight(TreeNode a){
        if(a == null) return 0;
        int l = checkHeight(a.left);
        int r = checkHeight(a.right);
        return l == -1 || r == -1 || Math.abs(l - r) > 1 ? -1 : Math.max(l, r) + 1;
    }
    public int isBalanced(TreeNode A) {
        return checkHeight(A) != -1 ? 1 : 0;
    }
}
