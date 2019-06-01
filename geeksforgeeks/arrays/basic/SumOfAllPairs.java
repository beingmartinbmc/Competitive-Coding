package arrays.basic;

import java.util.Scanner;

public class SumOfAllPairs {
    private static void printSum(int[] a){
        int s = 0;
        for(int i=0; i<a.length - 1; i++){
            for(int j=i+1; j<a.length; j++){
                if(Math.abs(a[j] - a[i]) > 1)
                    s += a[j] - a[i];
                else
                    s += 0;
            }
        }
        System.out.println(s);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            int n = input.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++)
                a[i] = input.nextInt();
            printSum(a);
            t -= 1;
        }
    }
}
