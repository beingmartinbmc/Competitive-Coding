import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCS2 {
    private static int getLCS(String a, String b) {
        int n = a.length(), m = b.length();
        String c = a + '$' + b;
        SuffixArray suffixArray = new SuffixArray(c);
        int[] sa = suffixArray.getSA();
        int[] lcp = suffixArray.getLcp();
        int lcs = 0, index = 0;
        for (int i=0; i<c.length() - 1; i++) {
            if (sa[i] < n && sa[i + 1] < n) continue;
            if (sa[i] > n && sa[i + 1] > n) continue;
            int length = lcp[i];
//            if (length > lcs) {
//                lcs = length;
//                index = i;
//            }
            lcs = Math.max(lcs, length);
        }
//        return c.substring(sa[index], sa[index] + lcs);
        return lcs;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        String t = br.readLine().trim();
        System.out.println(getLCS(s, t));
    }
}
