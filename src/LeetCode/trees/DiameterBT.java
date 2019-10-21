package LeetCode.trees;

import java.util.concurrent.atomic.*;

class Solution {
    private int helper(TreeNode root, AtomicInteger i){
        if(root == null) return 0;
        int left = helper(root.left, i);
        int right = helper(root.right, i);
        i.set(Math.max(i.get(), left + right + 1));
        return Math.max(left, right) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        AtomicInteger x = new AtomicInteger(1);
        helper(root, x);
        return x.get() - 1;
    }
}
