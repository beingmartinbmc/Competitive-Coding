package interviewbit.trees;

class Solution {
    private TreeNode constructPostIn(ArrayList<Integer> inorder, ArrayList<Integer> postorder, int inS, int inE, int prS, int prE, Map<Integer, Integer> lookup){
        if(inS > inE) return null;
        int rootData = postorder.get(prE);
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
    public TreeNode buildTree(ArrayList<Integer> inorder, ArrayList<Integer> post) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.size(); i++)
            map.put(inorder.get(i), i);
        return constructPostIn(inorder, post, 0, inorder.size() - 1, 0, post.size() - 1, map);
    }
}
