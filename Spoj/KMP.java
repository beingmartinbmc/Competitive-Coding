import java.util.ArrayList;
import java.util.List;

public class KMP {
    private String p;
    KMP(String p) {
        this.p = p;
    }

    public int[] computePrefix() {
        int n = this.p.length();
        int[] p = new int[n];
        for (int i=1; i<n; i++) {
            int j = p[i-1];
            while (j > 0 && this.p.charAt(i) != this.p.charAt(j)) j = p[j - 1];
            if (this.p.charAt(i) == this.p.charAt(j)) j++;
            p[i] = j;
        }
        return p;
    }

    public List<Integer> findOccurences(String s) {
        int n = p.length();
        p = p + "#" + s;
        int[] prefix = computePrefix();
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<prefix.length; i++) if (prefix[i] == n) list.add(i - 2 * n + 1);
        return list;
    }
}
