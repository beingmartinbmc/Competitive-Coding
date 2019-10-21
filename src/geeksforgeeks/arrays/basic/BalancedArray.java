package geeksforgeeks.arrays.basic;

import java.util.Scanner;

public class BalancedArray {
    private static int getMinimumValue(int[] a){
        int middle = a.length / 2;
        int leftSum = 0;
        int rightSum = 0;
        for(int i=0, j=middle; i < middle && j < a.length; i ++, j++){
            leftSum += a[i];
            rightSum += a[j];
        }
        return Math.abs(leftSum - rightSum);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            int n = input.nextInt();
            int[] a = new int[n];
            for(int i=0; i<a.length; i++)
                a[i] = input.nextInt();
            System.out.println(getMinimumValue(a));
            t -= 1;
        }
    }
}
