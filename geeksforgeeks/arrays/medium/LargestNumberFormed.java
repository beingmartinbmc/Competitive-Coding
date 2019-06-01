package arrays.medium;

import java.util.*;

public class LargestNumberFormed {
    private static void generateMax(int[] a){
        ArrayList<String> b = new ArrayList<>();
        for(int i : a)
            b.add(Integer.toString(i));
        b.sort((o1, o2) -> {
            String XY = o1 + o2;
            String YX = o2 + o1;
            return YX.compareTo(XY);
        });
        b.parallelStream().forEach(System.out::print);
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
            generateMax(a);
            t -= 1;
        }
    }
}