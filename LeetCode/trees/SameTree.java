class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        else if(p == null || q == null) return false;
        Queue<TreeNode> queueOne = new ArrayDeque<>();
        Queue<TreeNode> queueTwo = new ArrayDeque<>();
        queueOne.add(p); queueTwo.add(q);
        while(!queueOne.isEmpty() && !queueTwo.isEmpty()){
            TreeNode a = queueOne.poll();
            TreeNode b = queueTwo.poll();
            if(a.val != b.val) return false;
            if(a.left != null && b.left != null){
                queueOne.add(a.left);
                queueTwo.add(b.left);
            }
            else if(a.left != null || b.left != null) return false;
            if(a.right != null && b.right != null){
                queueOne.add(a.right);
                queueTwo.add(b.right);
            }
            else if(a.right != null || b.right != null) return false;
        }
        return true;
    }
}
