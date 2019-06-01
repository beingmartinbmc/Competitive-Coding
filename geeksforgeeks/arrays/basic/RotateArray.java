package arrays.basic;

import java.util.Scanner;

public class RotateArray {
    private static void printArray(int[] a){
        for(int i: a)
            System.out.print(i+" ");
        System.out.println();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            int n = input.nextInt();
            int[] b = new int[n];
            int d = input.nextInt();
            for(int i=0; i<n; i++)
                b[(b.length + i - d) % b.length] = input.nextInt();
            printArray(b);
            t -= 1;
        }
    }
}
