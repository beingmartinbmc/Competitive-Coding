package geeksforgeeks.arrays.easy;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumberFromDigits {
    private static void largestNumber(int[] a){
        for(int i=0; i<a.length; i++)
            a[i] *= - 1;
        Arrays.sort(a);
        for(int i=0; i<a.length; i++)
            a[i] *= - 1;
    }
    private static void print(int[] a){
        for(int i : a)
            System.out.print(i);
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++)
                a[i] = sc.nextInt();
            largestNumber(a);
            print(a);
            t -= 1;
        }
    }
}
