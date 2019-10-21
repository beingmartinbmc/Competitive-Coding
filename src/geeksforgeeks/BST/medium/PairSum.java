package geeksforgeeks.BST.medium;

class GfG
{
    private List<Integer> list;
    GfG(){
        list = new ArrayList<>();
    }
    private void inorder(Node root){
        if(root != null){
            inorder(root.left);
            list.add(root.data);
            inorder(root.right);
        }
    }

    public boolean findPair(Node root, int target){
        inorder(root);
        int i = 0, j = list.size() - 1;
        int s = 0;
        while(i < j){
            s = list.get(i) + list.get(j);
            if(s > target)
                j -= 1;
            else if(s < target)
                i += 1;
            else
                return true;
        }
        return false;
    }
}
