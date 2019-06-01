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
    private TreeNode construct(ArrayList<Integer> in, ArrayList<Integer> pre, int inS, int inE, int prS, int prE, Map<Integer, Integer> lookup){
        if(inS > inE) return null;
        int rootData = pre.get(prS);
        TreeNode root = new TreeNode(rootData);
        int rootIndex = lookup.get(rootData);
        int lInS = inS;
        int lInE = rootIndex - 1;
        int lPrS = prS + 1;
        int lPrE = lInE - lInS + lPrS;
        int rInS = rootIndex + 1;
        int rInE = inE;
        int rPrS = lPrE + 1;
        int rPrE = prE;
        root.left = construct(in, pre, lInS, lInE, lPrS, lPrE, lookup);
        root.right = construct(in, pre, rInS, rInE, rPrS, rPrE, lookup);
        return root;
    }
    public TreeNode buildTree(ArrayList<Integer> preorder, ArrayList<Integer> inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.size(); i++)
            map.put(inorder.get(i), i);
        return construct(inorder, preorder, 0, inorder.size() - 1, 0, preorder.size() - 1, map);
    }
}
