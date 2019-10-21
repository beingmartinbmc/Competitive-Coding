package Spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SUBSTR {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        String p = br.readLine().trim();
        KMP kmp = new KMP(p);
        kmp.findOccurences(s);
    }
}
