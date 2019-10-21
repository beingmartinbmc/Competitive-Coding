package LeetCode.trees;

class Solution {
    private void rightView(TreeNode root, List<Integer> output){
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            for(int i=1; i<=n; i++){
                TreeNode current = queue.poll();
                if(i == n) output.add(current.val);
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        rightView(root, output);
        return output;
    }
}
