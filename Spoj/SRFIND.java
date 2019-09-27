import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SRFIND {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine().trim();
            if (s.charAt(0) == '*') break;
            int answer = 1;
            KMP kmp = new KMP(s);
            int[] lps = kmp.computePrefix();
            int n = s.length(), l = lps[n-1];
            int x = n - l;
            if (x < n && n % x == 0) answer = n / x;
            System.out.println(answer);
        }
    }
}
