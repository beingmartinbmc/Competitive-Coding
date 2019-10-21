package interviewbit.trees;

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    private List<Integer> list = new ArrayList<>();
    public void inorder(TreeNode a){
        if(a != null){
            inorder(a.left);
            list.add(a.val);
            inorder(a.right);
        }
    }
    public int t2Sum(TreeNode A, int B) {
        inorder(A);
        int i = 0, j = list.size() - 1;
        while(i < j){
            if(list.get(i) + list.get(j) == B) return 1;
            else if(list.get(i) + list.get(j) < B) i += 1;
            else j -= 1;
        }
        return 0;
    }
}
