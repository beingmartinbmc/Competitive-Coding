class Solution {
    private TreeNode construct(int[] in, int[] pre, int inS, int inE, int prS, int prE, Map<Integer, Integer> lookup){
        if(inS > inE) return null;
        int rootData = pre[prS];
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++)
            map.put(inorder[i], i);
        return construct(inorder, preorder, 0, inorder.length - 1, 0, preorder.length - 1, map);
    }
}
