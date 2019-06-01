class Index{
    int index = 0;
}

class GFG
{
    private Node constructTree(int[] pre, char[] leaves, Index a, Node root){
        int i = a.index;
        if(i == pre.length) return null;
        root = new Node(pre[i]);
        a.index += 1;
        if(leaves[i] == 'N'){
            root.left = constructTree(pre, leaves, a, root.left);
            root.right = constructTree(pre, leaves, a, root.right);
        }
        return root;
    }
    public Node constructTree(int n, int pre[], char preLN[]){
        Node root = null;
        return constructTree(pre, preLN, new Index(), root);
    }
}
