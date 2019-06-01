class Solution {
    private TreeNode constructPostIn(int[] inorder, int[] postorder, int inS, int inE, int prS, int prE, Map<Integer, Integer> lookup){
        if(inS > inE) return null;
        int rootData = postorder[prE];
        TreeNode root = new TreeNode(rootData);
        int rootIndex = lookup.get(rootData);
        int lIS = inS;
        int lIE = rootIndex - 1;
        int lPS = prS;
        int lPE = lIE - lIS + lPS;
        int rInS = rootIndex + 1;
        int rInE = inE;
        int rPS = lPE + 1;
        int rPE = prE - 1;
        root.left = constructPostIn(inorder, postorder, lIS, lIE, lPS, lPE, lookup);
        root.right = constructPostIn(inorder, postorder, rInS, rInE, rPS, rPE, lookup);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] post) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++)
            map.put(inorder[i], i);
        return constructPostIn(inorder, post, 0, inorder.length - 1, 0, post.length - 1, map);
    }
}
