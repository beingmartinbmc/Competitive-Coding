package LeetCode.trees;

class Solution {
    private TreeNode construct(int[] a, int start, int end){
        if(start > end) return null;
        int mid = start + ((end - start) >> 1);
        TreeNode root = new TreeNode(a[mid]);
        root.left = construct(a, start, mid - 1);
        root.right = construct(a, mid + 1, end);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return construct(nums, 0, nums.length - 1);
    }
}
