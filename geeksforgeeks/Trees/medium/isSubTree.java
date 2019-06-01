class GfG{
 private void inorder(Tree root, StringBuilder x){
        if(root == null){
            x.append('$');
            return;
        }
        inorder(root.left, x);
        x.append(root.data);
        inorder(root.right, x);
    }
    private void preorder(Tree root, StringBuilder x){
        if(root == null){
            x.append('$');
            return;
        }
        x.append(root.data);
        preorder(root.left, x);
        preorder(root.right, x);
    }
    private int[] buildLPS(String pattern){
        int[] lps = new int[pattern.length()];
        int j = 0;
        int i = 1;
        while(i < pattern.length()){
            if(pattern.charAt(i) == pattern.charAt(j)){
                lps[i] = j + 1;
                i += 1;
                j += 1;
            }
            else{
                if(j == 0){
                    lps[i] = 0;
                    i += 1;
                }
                else j = lps[j - 1];
            }
        }
        return lps;
    }

    private boolean isPresent(String text, String pattern){
        int i = 0,  j = 0;
        int[] lps = buildLPS(pattern);
        while(i < text.length() && j < pattern.length()){
            if(text.charAt(i) == pattern.charAt(j)){
                i += 1;
                j += 1;
            }
            else{
                if(j == 0) i += 1;
                else j = lps[j - 1];
            }
        }
        return j == pattern.length();
    }
    public boolean isSubtree(Tree T1, Tree T2) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        StringBuilder c = new StringBuilder();
        StringBuilder d = new StringBuilder();
        inorder(T1, a); inorder(T2, b);
        preorder(T1, c); preorder(T2, d);
        return isPresent(a.toString(), b.toString()) && isPresent(c.toString(), d.toString());
    }
}
