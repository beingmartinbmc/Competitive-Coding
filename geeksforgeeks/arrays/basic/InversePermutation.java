package arrays.basic;

import java.util.Scanner;

public class InversePermutation {
    private static int[] permute(int[] a){
        int[] b = new int[a.length];
        for(int i=1; i<a.length; i++)
            b[(a[i]) % a.length] = i;
        return b;
    }

    private static void printArray(int[] a){
        for(int i=1; i<a.length; i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            int n = input.nextInt();
            int[] a = new int[n+1];
            for(int i=1; i<=n; i++)
                a[i] = input.nextInt();
            a = permute(a);
            printArray(a);
            t -= 1;
        }
    }
}
