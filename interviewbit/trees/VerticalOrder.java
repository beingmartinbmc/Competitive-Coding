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
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode root) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        LinkedList<Integer> hd = new LinkedList<>();
        queue.add(root);
        hd.add(0);
        int min = 0;
        int max = 0;
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            int d = hd.poll();
            min = Math.min(min, d);
            max = Math.max(max, d);
            if(current == null) break;
            if(map.containsKey(d)) map.get(d).add(current.val);
            else if(!map.containsKey(d)){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(current.val);
                map.put(d, temp);
            }
            if(current.left != null){
                queue.add(current.left);
                hd.add(d - 1);
            }
            if(current.right != null){
                queue.add(current.right);
                hd.add(d + 1);
            }
        }
        for(int i=min; i<=max; i++)
            if(map.containsKey(i))
                output.add(map.get(i));
        return output;
    }
}
