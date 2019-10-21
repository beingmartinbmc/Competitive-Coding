package geeksforgeeks.arrays.basic;

import java.util.Scanner;

public class AppearsOnce {
    private static int element(int[] a){
        int i;
        for(i=0; i<a.length - 1; i+= 2){
            int j = i + 1;
            if(a[i] != a[j])
                break;
        }
        return a[i];
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            int n = input.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++)
                a[i] = input.nextInt();
            System.out.println(element(a));
            t -= 1;
        }
    }
}
