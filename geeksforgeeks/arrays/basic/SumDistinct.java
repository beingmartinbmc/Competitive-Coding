package arrays.basic;

import java.util.HashSet;
import java.util.Scanner;

public class SumDistinct {
    private static int sum(HashSet<Integer> set){
        int s = 0;
        for(int i : set)
            s += i;
        return s;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            int n = input.nextInt();
            HashSet<Integer> set = new HashSet<>();
            for(int i=0; i<n; i++)
                set.add(input.nextInt());
            System.out.println(sum(set));
            t -= 1;
        }
    }
}
