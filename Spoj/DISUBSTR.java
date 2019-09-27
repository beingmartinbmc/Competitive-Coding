import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DISUBSTR {
    private static int getDistinctCount(String s){
        SuffixArray sa = new SuffixArray(s);
        int n = s.length(), x = n * (n + 1) >> 1;
        for (int i=0; i<=n-2; i++) x -= sa.getLcp()[i];
        return x;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t > 0) {
            String s = br.readLine().trim();
            System.out.println(getDistinctCount(s));
            t -= 1;
        }
    }
}
