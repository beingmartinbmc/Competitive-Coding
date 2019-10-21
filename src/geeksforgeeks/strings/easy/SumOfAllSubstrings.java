package geeksforgeeks.strings.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfAllSubstrings {
    private static int getDigit(char c){
        return c - '0';
    }
    private static long getSum(String s){
        char[] a = s.toCharArray();
        long sum = 0;
        long mf = 1;
        for(int i = a.length - 1; i >= 0; i--){
            sum += getDigit(a[i]) * (i+1) * mf;
            mf = mf * 10 + 1;
        }
        return sum;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer b = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        while(t > 0){
            String s = br.readLine();
            b.append(getSum(s));
            System.out.println(b);
            t -= 1;
            b.setLength(0);
        }
    }
}
