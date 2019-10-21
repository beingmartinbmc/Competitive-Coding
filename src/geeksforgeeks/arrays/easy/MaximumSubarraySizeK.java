package geeksforgeeks.arrays.easy;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaximumSubarraySizeK {
    private static void printMaximum(int[] a, int k){
        for(int i=0; i <= a.length - k; i++){
            int max = a[i];
            for(int j = i; j < (i + k); j++)
                max = Math.max(max, a[j]);
            System.out.print(max +" ");
        }
    }
    private static void printMaximumEfficient(int[] a, int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i<k; i++)
            queue.add(a[i]);
        System.out.print(queue.peek()+" ");
        for(int i=k; i<a.length; i++){
            queue.remove(a[i - k]);
            queue.add(a[i]);
            System.out.print(queue.peek() +" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++)
                a[i] = scanner.nextInt();
            printMaximumEfficient(a, k);
        }
    }
}
