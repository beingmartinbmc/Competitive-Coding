package arrays.medium;

import java.util.*;
import java.lang.*;
import java.io.*;

public class NextPermutation {
    private static void swap(int[] a, int x, int y){
        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }
    private static void reverse(int[] a, int left, int right){
        int i = left;
        int j = right;
        while(i < j)
            swap(a, i++, j--);
    }
    private static int[] nextPermutation(int[] a){
        int inversePoint = a.length - 2;
        while(inversePoint >= 0  && a[inversePoint] >= a[inversePoint + 1])
            inversePoint -= 1;
        for(int i = a.length - 1; i >= inversePoint + 1; i--) {
            if (a[i] > a[inversePoint]){
                swap(a, i, inversePoint);
                break;
            }
        }
        reverse(a, inversePoint + 1, a.length - 1);
        return a;
    }
    private static void printArray(int[] a){
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t > 0){
		    int n = input.nextInt();
		    int[] a = new int[n];
		    for(int i=0; i<n; i++)
		        a[i] = input.nextInt();
		    a = nextPermutation(a);
		    printArray(a);
		    t -= 1;
		}
	}
}