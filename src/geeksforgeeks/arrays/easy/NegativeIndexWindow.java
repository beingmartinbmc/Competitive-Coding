package geeksforgeeks.arrays.easy;


import java.util.Scanner;

public class NegativeIndexWindow {
    private static void printIndices(int[] a, int k){
        for(int i=0; i <= a.length - k; i++){
            boolean available = false;
            for(int j=i; j<(i+k); j++){
                if(a[j] < 0) {
                    available = true;
                    System.out.print(a[j] + " ");
                    break;
                }
            }
            if(!available)
                System.out.print(0 + " ");
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
            int k = input.nextInt();
            printIndices(a, k);
            t -= 1;
        }
    }
}
