class Solution {
    public boolean isUnivalTree(TreeNode root) {
        final int ROOT_VALUE = root.val;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            if(current.val != ROOT_VALUE) return false;
            if(current.left != null) queue.add(current.left);
            if(current.right != null) queue.add(current.right);
        }
        return true;
    }
}
