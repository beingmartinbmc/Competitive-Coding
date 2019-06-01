package arrays.basic;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargest {
    private static void printLargest(int[] a, int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : a)
            queue.add(i);
        while(k > 0 && !queue.isEmpty()){
            System.out.print(queue.poll() +" ");
            k -= 1;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            int n = input.nextInt();
            int k = input.nextInt();
            int[] a = new int[n];
            for(int i=0; i<a.length; i++)
                a[i] = input.nextInt();
            printLargest(a, k);
            t -= 1;
        }
    }
}
