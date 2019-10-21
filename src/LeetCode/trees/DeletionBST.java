package LeetCode.trees;

class Solution {
    private boolean isLeaf(TreeNode root){
        return root.left == null && root.right == null;
    }

    private TreeNode getMax(TreeNode root){
        TreeNode current = root;
        while(current.right != null) current = current.right;
        return current;
    }

    public TreeNode deleteNode(TreeNode root, int data){
        if(root == null) return root;
        if(root.val > data) root.left = deleteNode(root.left, data);
        else if(root.val < data) root.right = deleteNode(root.right, data);
        else{
            if(isLeaf(root)) root = null;
            else if(root.left == null) root = root.right;
            else if(root.right == null) root = root.left;
            else{
                TreeNode temp = getMax(root.left);
                root.val = temp.val;
                root.left = deleteNode(root.left, temp.val);
            }
        }
        return root;
    }
}
