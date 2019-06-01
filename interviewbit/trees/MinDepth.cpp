int Solution::minDepth(TreeNode* root) {
    if(root == NULL) return 0;
        int left = minDepth(root->left);
        int right = minDepth(root->right);
        if(left == 0) return right + 1;
        if(right == 0) return left + 1;
        return min(left, right) + 1;
}
