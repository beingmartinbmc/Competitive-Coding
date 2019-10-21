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
    private TreeNode first = null, prev = null, last = null;
    private void segment(TreeNode current){
        if(prev != null){
            if(prev.val > current.val){
                if(first == null) first = prev;
                last = current;
            }
        }
        prev = current;
    }

    private void swap(TreeNode a, TreeNode b){
        if(a.val != b.val){
            a.val ^= b.val;
            b.val ^= a.val;
            a.val ^= b.val;
        }
    }

    private TreeNode getMorrisPred(TreeNode current, TreeNode target){
        while(current.right != null && current.right != target) current = current.right;
        return current;
    }

    private void inorder(TreeNode root){
        TreeNode current = root;
        while(current != null){
            if(current.left == null){
                segment(current);
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
                    segment(current);
                    current = current.right;
                }
            }
        }
    }

    public ArrayList<Integer> recoverTree(TreeNode A) {
        inorder(A);
        ArrayList<Integer> list = new ArrayList<>();
        swap(first, last);
        list.add(first.val);
        list.add(last.val);
        return list;
    }
}
