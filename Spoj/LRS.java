import java.util.Arrays;

public class LRS {
    private static String getLRS(String s) {
        SuffixArray suffixArray = new SuffixArray(s);
        int max = 0, start = 0, end = 0;
        int n = s.length();
        int[] sa = suffixArray.getSA(), lcp = suffixArray.getLcp();
        for (int i=0; i<n-1; i++) {
            int len = lcp[i];
            if (len > max) {
                max = len;
                start = sa[i];
                end = sa[i] + len;
            }
        }
        return s.substring(start, end);
    }
}
