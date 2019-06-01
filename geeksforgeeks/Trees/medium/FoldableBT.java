class GFG
{
   private boolean isFoldable(Node a, Node b){
       if(a == null && b == null) return true;
       else if(a == null || b == null) return false;
       return isFoldable(a.right, b.left) && isFoldable(a.left, b.right);
   }
   public boolean isFoldable(Node root){
       return isFoldable(root.left, root.right);
   }
}
