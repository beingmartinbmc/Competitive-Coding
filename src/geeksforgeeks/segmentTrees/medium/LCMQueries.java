package geeksforgeeks.segmentTrees.medium;

class GfG{
    private int[] tree;

    private int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    private int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }

    private void buildTree(int[] a, int index, int s, int e){
        if(s > e) return;
        if(s == e){
            tree[index] = a[s];
            return;
        }
        int mid = s + (e - s) / 2;
        buildTree(a, 2*index, s, mid);
        buildTree(a, 2*index+1, mid + 1, e);
        tree[index] = lcm(tree[2*index], tree[2*index+1]);
    }

    public void build(int[] a, int index, int s, int e){
        int n = a.length;
        tree = new int[4 * n - 1];
        buildTree(a, index, s, e);
    }

    private int queryMe(int index, int start, int end, int l, int r){
        if(l > end || r < start) return 1;
        if(start >= l && end <= r) return tree[index];
        int mid = start + (end - start) / 2;
        return lcm(queryMe(2*index, start, mid, l, r), queryMe(2*index+1, mid+1, end, l, r));
    }

    public int query(int index, int s, int e, int qs, int qe){
        return queryMe(index, s, e, qs, qe);
    }
}
