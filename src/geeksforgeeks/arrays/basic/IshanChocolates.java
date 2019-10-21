package geeksforgeeks.arrays.basic;
import java.util.*;

public class IshanChocolates {
    private static void sort(int[] a){
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : a)
            queue.add(i);
        int index = 0;
        while(!queue.isEmpty())
            a[index++] = queue.poll();
    }

    private static int getLevel(int[] a){
        return a[a.length - 1];
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int t, n;
        int[] a;
        t = input.nextInt();
        while(t > 0){
            n = input.nextInt();
            a = new int[n];
            for(int i=0; i<n; i++)
                a[i] = input.nextInt();
            sort(a);
            System.out.println(getLevel(a));
            t -= 1;
        }
    }
}