class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode current = root;
        while(current != null){
            if(current.val > Math.max(p.val, q.val)) current = current.left;
            else if(current.val < Math.min(p.val, q.val)) current = current.right;
            else break;
        }
        return current;
    }
}
