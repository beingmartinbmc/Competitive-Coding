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
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stackOne = new Stack<>();
        Stack<TreeNode> stackTwo = new Stack<>();
        stackOne.push(root);
        while(!stackOne.isEmpty()){
            TreeNode current = stackOne.pop();
            stackTwo.push(current);
            if(current.left != null) stackOne.push(current.left);
            if(current.right != null) stackOne.push(current.right);
        }
        ArrayList<Integer> output = new ArrayList<>();
        while(!stackTwo.isEmpty()) output.add(stackTwo.pop().val);
        return output;
    }
}
