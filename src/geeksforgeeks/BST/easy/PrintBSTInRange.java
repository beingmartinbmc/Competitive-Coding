package geeksforgeeks.BST.easy;

class GfG
{
    private int[] x;
    private int p = 0;

    private int getSize(Node root){
        if(root == null) return 0;
        return getSize(root.left) + getSize(root.right) + 1;
    }

    private void inorder(Node root){
        if(root != null){
            inorder(root.left);
            x[p++] = root.key;
            inorder(root.right);
        }
    }

    private void initialise(Node root){
        x = new int[getSize(root)];
        inorder(root);
    }

    void printNearNodes(Node node, int k1, int k2){
        initialise(node);
        Arrays.stream(x).forEach(e->{
            if(e >= k1 && e <= k2)
                System.out.print(e+" ");
        });
    }
}
