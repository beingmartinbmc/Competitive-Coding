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
    private boolean hasPath(TreeNode root, int sum, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> output){
        if(root == null) return false;
        path.add(root.val);
        if(root.left == null && root.right == null && sum == root.val){
            ArrayList<Integer> temp = new ArrayList<>(path);
            output.add(temp);
        }
        if((hasPath(root.left, sum-root.val, path, output)) || (hasPath(root.right, sum-root.val, path, output))) return true;
        path.remove(path.size() - 1);
        return false;
    }
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode head, int sum) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        hasPath(head, sum, new ArrayList<>(), output);
        return output;
    }
}
