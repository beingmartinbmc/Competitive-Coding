package arrays.basic;

import java.util.Scanner;

public class ZigZag {
    private static void swap(int a, int b, int[] x){
        int temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }
    private static void ziggerIt(int[] a){
        boolean smaller = true;
        for(int i=0; i<a.length - 1;i++){
            if(smaller && (a[i] > a[i+1]))
                swap(i, i+1, a);
            if(!smaller && (a[i] < a[i+1]))
                swap(i, i+1, a);
            smaller = !smaller;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            int n = input.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++)
                a[i] = input.nextInt();
            ziggerIt(a);
            for(int i : a)
                System.out.print(i+" ");
            System.out.println();
            t -= 1;
        }
    }
}
