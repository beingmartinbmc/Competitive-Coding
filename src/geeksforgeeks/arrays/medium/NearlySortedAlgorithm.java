package geeksforgeeks.arrays.medium;

import java.util.PriorityQueue;
import java.util.Scanner;

public class NearlySortedAlgorithm {
    private static int[] sort(int[] a, int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0; i<=k; i++)
            queue.add(a[i]);
        int index = 0;
        for(int i=k+1; i<a.length && !queue.isEmpty(); i++){
            a[index++] = queue.poll();
            queue.add(a[i]);
        }
        while(!queue.isEmpty())
            a[index++] = queue.poll();
        return a;
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            int n = input.nextInt();
            int k = input.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++)
                a[i] = input.nextInt();
            a = sort(a, k);
            for(int i : a)
                System.out.print(i+" ");
            System.out.println();
            t -= 1;
        }
    }
}
