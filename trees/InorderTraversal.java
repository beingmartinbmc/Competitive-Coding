class Solution {
    private TreeNode getMorrisPred(TreeNode current, TreeNode target){
        while(current.right != null && current.right != target) current = current.right;
        return current;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode current = root;
        List<Integer> output = new ArrayList<>();
        while(current != null){
            if(current.left == null){
                output.add(current.val);
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
                    output.add(current.val);
                    current = current.right;
                }
            }
        }
        return output;
    }
}
