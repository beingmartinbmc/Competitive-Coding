package geeksforgeeks.segmentTrees.easy;

class GfG{
    private int[] tree;

    private boolean isPowerOf2(int n){
        return (n & (n - 1)) == 0;
    }

    private int getNextPowerOf2(int n){
        if(isPowerOf2(n)) return n;
        int p = 1;
        while(p < n) p <<= 1;
        return p;
    }
    private void build(int[] a, int index, int s, int e){
        if(s > e) return;
        if(s == e){
            tree[index] = a[s];
            return;
        }
        int mid = s + (e - s) / 2;
        build(a, 2 * index + 1, s, mid);
        build(a, 2 * index + 2, mid + 1, e);
        tree[index] = tree[2*index+1] + tree[2*index+2];
    }

    private int query(int index, int s, int e, int qs, int qe){
        if(qs > e || qe < s) return 0;
        if(s >= qs && e <= qe) return tree[index];
        int mid = s + (e - s)/2;
        return query(2*index+1, s, mid, qs, qe)
                      + query(2*index+2, mid+1, e, qs, qe);
    }

    public int getSum(int arr[], int n, int l, int r){
        int x = getNextPowerOf2(n);
        tree = new int[2 * x - 1];
        build(arr, 0, 0, n- 1);
        return query(0, 0, n - 1, l, r);
    }
}
