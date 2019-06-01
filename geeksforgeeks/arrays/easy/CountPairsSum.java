package arrays.easy;

import java.util.Scanner;

public class CountPairsSum {
    private static int getCount(int[] a, int s){
        int count = 0;
        for(int i=0; i<a.length - 1; i++){
            for(int j=i+1; j<a.length; j++)
                if(s == a[i] + a[j])
                    count += 1;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            int n = input.nextInt();
            int s = input.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++)
                a[i] = input.nextInt();
            System.out.println(getCount(a, s));
            t -= 1;
        }
    }
}
