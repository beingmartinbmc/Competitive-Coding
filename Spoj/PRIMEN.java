import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PRIMEN {
    private static boolean[] primes = new boolean[10001];
    private static void buildSieve() {
        for (int i=2; i*i <= 1000; i++) if (!primes[i]) for (int j=i*i; j<=1000; j+=i) primes[j] = true;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        buildSieve();
        while (t > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            for (int i=1; i<=n; i++) if (!primes[i]) System.out.println(i);
            t -= 1;
        }
    }
}
