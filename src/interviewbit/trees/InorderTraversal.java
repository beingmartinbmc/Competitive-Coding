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
    private TreeNode getMorrisPred(TreeNode current, TreeNode target){
        while(current.right != null && current.right != target) current = current.right;
        return current;
    }
    private void inorder(TreeNode root, List<Integer> output){
        TreeNode current = root, parent = null;
        while(current != null){
            if(current.left == null){
                output.add(current.val);
                current = current.right;
            }
            else{
                TreeNode pred = getMorrisPred(current.left, current);
                if(pred.right == null){
                    pred.right = current;
                    current = current.left;
                }
                else{
                    pred.right = null;
                    output.add(current.val);
                    current = current.right;
                }
            }
        }
    }

    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> temp = new ArrayList<>();
        inorder(A, temp);
        return temp;
    }
}
