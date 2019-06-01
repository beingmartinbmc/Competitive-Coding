class GfG{
    private int getClosest(Node root, int k){
        int ceil = Integer.MAX_VALUE , floor = Integer.MIN_VALUE;
        Node current = root;
        while(current != null){
            if(current.data == k){
                floor = k;
                ceil = k;
                break;
            }
            else if(current.data < k){
                floor = current.data;
                current = current.right;
            }
            else{
                ceil = current.data;
                current = current.left;
            }
        }
        return Math.abs(floor - k) < Math.abs(ceil - k) ? floor : ceil;
    }
    public int maxDiff(Node root, int k){
        return getClosest(root, k);
    }
}
