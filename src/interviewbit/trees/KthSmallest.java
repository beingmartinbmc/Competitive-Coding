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
     private TreeNode getMorrisPredecessor(TreeNode current, TreeNode target){
        while(current.right != null && current.right != target) current = current.right;
        return current;
    }
    public int kthSmallest(TreeNode root, int k) {
        TreeNode small = null;
        TreeNode current = root;
        while(current != null){
            if(current.left == null){
                k -= 1;
                if(k == 0){
                    small = current;
                    break;
                }
                current = current.right;
            }
            else{
                TreeNode pred = getMorrisPredecessor(current.left, current);
                if(pred.right == null){
                    pred.right = current;
                    current = current.left;
                }
                else{
                    k -= 1;
                    if(k == 0){
                        small = current;
                        break;
                    }
                    pred.right = null;
                    current = current.right;
                }
            }
        }
        return small.val;
    }
    public int kthsmallest(TreeNode A, int B) {
        return kthSmallest(A, B);
    }
}
