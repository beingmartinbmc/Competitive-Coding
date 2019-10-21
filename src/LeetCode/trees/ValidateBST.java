package LeetCode.trees;

class Solution {
    private TreeNode getMorrisPred(TreeNode current, TreeNode target){
        while(current.right != null && current.right != target) current = current.right;
        return current;
    }
    private boolean isValid(TreeNode root){
        TreeNode current = root, parent = null;
        boolean flag = false;
        while(current != null){
            if(flag && parent.val >= current.val) return false;
            if(current.left == null){
                parent = current;
                flag = true;
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
                    parent = current;
                    flag = true;
                    current = current.right;
                }
            }
        }
        return true;
    }
    public boolean isValidBST(TreeNode root) {
        return isValid(root);
    }
}
