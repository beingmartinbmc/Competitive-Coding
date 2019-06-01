package arrays.easy;

import java.util.*;

public class CountSmallerElementsRightSide {
    private static int[] countSmaller(int[] a){
        int[] countArray = new int[a.length];
        for(int i=0; i<a.length - 1;i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] > a[j])
                    countArray[i] += 1;
            }
        }
        return countArray;
    }

    private static void printArray(int[] b){
        b = countSmaller(b);
        for(int i : b)
            System.out.print(i+" ");
        System.out.println();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            int n = input.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++)
                a[i] = input.nextInt();
            printArray(a);
            t -= 1;
        }
    }
}
