package geeksforgeeks.Trees.medium;

class GfG
{
    private void getLOT(Node root, int d, Map<Integer, List<Integer>> map){
        if(root == null) return;
        if(map.containsKey(d)) map.get(d).add(root.data);
        else{
            List<Integer> temp = new ArrayList<>();
            temp.add(root.data);
            map.put(d, temp);
        }
        getLOT(root.left, d + 1, map);
        getLOT(root.right, d + 1, map);
    }
    public void printCorner(Node node){
        Map<Integer, List<Integer>> map = new HashMap<>();
        getLOT(node, 0, map);
        LinkedList<Integer> set = new LinkedList<>();
        map.forEach((k,v)->{
            set.add(v.get(0));
            set.add(v.get(v.size() - 1));
        });
        set.removeFirst();
        set.forEach(e->System.out.print(e+" "));
    }

}
