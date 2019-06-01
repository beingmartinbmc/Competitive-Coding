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
    private TreeNode swap(TreeNode A){
        TreeNode temp = A.left;
        A.left = A.right;
        A.right = temp;
        return A;
    }
    public TreeNode invertTree(TreeNode A) {
        if(A == null) return A;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(A);
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            if(current.left != null && current.right != null) current = swap(current);
            if(current.left != null) queue.offer(current.left);
            if(current.right != null) queue.offer(current.right);
        }
        return A;
    }
}
