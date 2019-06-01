class GfG
{
     private void getDOT(TreeNode root, int d, Map<Integer, List<Integer>> map){
         if(root == null) return;
         if(map.containsKey(d)) map.get(d).add(root.data);
         else{
             List<Integer> temp = new ArrayList<>();
             temp.add(root.data);
             map.put(d, temp);
         }
         getDOT(root.left, d + 1, map);
         getDOT(root.right, d, map);
     }

     private void printDOT(TreeNode root){
         Map<Integer, List<Integer>> map = new HashMap<>();
         getDOT(root, 0, map);
         map.forEach((k,v)->v.forEach(t->System.out.print(t+" ")));
     }
     
     public void diagonalPrint(TreeNode root){
         printDOT(root);
     }
}
