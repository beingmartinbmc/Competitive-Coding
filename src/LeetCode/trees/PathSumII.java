package LeetCode.trees;

class Solution {
    private boolean isLeaf(TreeNode root){
        return root.left == null && root.right == null;
    }
    private boolean hasPath(TreeNode root, int sum, List<Integer> path, List<List<Integer>> result){
        if(root == null) return false;
        path.add(root.val);
        if(isLeaf(root) && root.val == sum){
            final List<Integer> temp = new ArrayList<>(path);
            result.add(temp);
        }
        if(hasPath(root.left, sum-root.val, path, result) || hasPath(root.right, sum-root.val, path, result)) return true;
        path.remove(path.size() - 1);
        return false;
    }
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> output = new ArrayList<>();
        hasPath(root, sum, new ArrayList<>(), output);
        return output;
    }
}
