class Solution {
    private List<Integer> list = new ArrayList<>();
    private void inorder(TreeNode root){
        if(root != null){
            inorder(root.left);
            list.add(root.val);
            inorder(root.right);
        }
    }
    public boolean findTarget(TreeNode root, int k) {
        inorder(root);
        int i = 0, j = list.size() - 1;
        while(i < j){
            if(list.get(i) + list.get(j) == k) return true;
            else if(list.get(i) + list.get(j) < k) i += 1;
            else j -= 1;
        }
        return false;
    }
}
