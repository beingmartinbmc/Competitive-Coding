package arrays.easy;

import java.util.Arrays;
import java.util.Scanner;

public class FittingArray {
    private static boolean isFitting(Integer[] a, Integer[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0; i<a.length; i++)
            if(a[i] > b[i])
                return false;
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while(T > 0){
            int n = input.nextInt();
            Integer[] a = new Integer[n];
            Integer[] b = new Integer[n];
            for(int i=0; i<n; i++)
                a[i] = input.nextInt();
            for(int i=0; i<n; i++)
                b[i] = input.nextInt();
            System.out.println(isFitting(a, b) ? "YES" : "NO");
            T -= 1;
        }
    }
}
