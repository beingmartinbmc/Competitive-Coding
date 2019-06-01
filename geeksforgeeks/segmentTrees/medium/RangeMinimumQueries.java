class GfG
{
    static int st[];

    private static boolean isPowerOf2(int n){
        return (n & (n - 1)) == 0;
    }

    private static int getNextPowerOf2(int n){
        if(isPowerOf2(n)) return n;
        int p = 1;
        while(p < n) p <<= 1;
        return p;
    }

    private static void buildTree(int[] a, int[] tree, int index, int s, int e){
        if(s > e) return;
        if(s == e){
            tree[index] = a[s];
            return;
        }
        int mid = s + (e - s)/2;
        buildTree(a, tree, 2*index+1, s, mid);
        buildTree(a, tree, 2*index+2, mid+1, e);
        tree[index] = Math.min(tree[2*index+1], tree[2*index+2]);
    }

    public static int[] constructST(int arr[], int n){
        int x = getNextPowerOf2(n);
        st = new int[2 * x - 1];
        buildTree(arr, st, 0, 0, n -1);
        return st;
    }

    private static int query(int index, int s, int e, int qs, int qe){
        if(qs > e || qe < s) return Integer.MAX_VALUE;
        if(s >= qs && e <= qe) return st[index];
        int mid = s + (e - s) / 2;
        int left = query(2*index+1, s, mid, qs, qe);
        int right = query(2*index+2, mid+1, e, qs, qe);
        return Math.min(left, right);
    }

    public static int RMQ(int st[], int n, int l, int r){
        return query(0, 0, n-1, l, r);
    }

}
