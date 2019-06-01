class Solution {
    private TreeNode first = null, second = null, prev = null;

    private void swap(TreeNode a, TreeNode b){
        int t = a.val;
        a.val = b.val;
        b.val = t;
    }

    private TreeNode getMorrisPred(TreeNode current, TreeNode target){
        while(current.right != null && current.right != target) current = current.right;
        return current;
    }

    private void segment(TreeNode root){
        if(prev != null){
            if(prev.val > root.val){
                if(first == null) first = prev;
                second = root;
            }
        }
        prev = root;
    }

    private void inorder(TreeNode root){
        TreeNode current = root;
        while(current != null){
            if(current.left == null){
                segment(current);
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
                    segment(current);
                    current = current.right;
                }
            }
        }
    }

    public void recoverTree(TreeNode root) {
        inorder(root);
        swap(first, second);
    }
}
