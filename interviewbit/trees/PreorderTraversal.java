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
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode current = stack.pop();
            list.add(current.val);
            if(current.right != null) stack.push(current.right);
            if(current.left != null) stack.push(current.left);
        }
        return list;
    }
}
