import java.util.List;
import java.util.Scanner;

public class NHAY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            scanner.nextLine();
            String needle = scanner.nextLine();
            String haystack = scanner.nextLine();
            KMP kmp = new KMP(needle);
            List<Integer> result = kmp.findOccurences(haystack);
            if (result.size() > 0) for (int i : result) System.out.println(i-1);
            else System.out.println();
        }
    }
}
