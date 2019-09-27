import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class NAJPF {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t > 0) {
            String[] a = br.readLine().trim().split(" ");
            KMP kmp = new KMP(a[1]);
            List<Integer> result = kmp.findOccurences(a[0]);
            if (result.size() == 0) System.out.println("Not Found");
            else{
                System.out.println(result.size());
                for (int i : result) System.out.print(i +" ");
                System.out.println();
            }
            System.out.println();
            t -= 1;
        }
    }
}
