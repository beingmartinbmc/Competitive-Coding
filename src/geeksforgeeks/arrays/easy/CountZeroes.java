package geeksforgeeks.arrays.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CountZeroes {
    private static int lowerBound(Integer[] a, int l, int h, int x){
        while(l < h){
            int middle = l + (h - l)/2;
            if(a[middle] > x)
                l = middle + 1;
            else
                h = middle;
        }
        return l;
    }
    private static int upperBound(Integer[] a, int l, int h, int x){
        while(l < h){
            int middle = l + (h - l)/2;
            if(x > a[middle])
                h = middle;
            else
                l = middle + 1;
        }
        return l;
    }
    private static int count(Integer[] a, int element){
        return upperBound(a, 0, a.length -1, element) - lowerBound(a, 0, a.length -1, element) + 1;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            int n = input.nextInt();
            Integer[] a = new Integer[n];
            for(int i=0; i<n; i++)
                a[i] = input.nextInt();
            System.out.println(count(a, 0));
            t -= 1;
        }
    }
}
