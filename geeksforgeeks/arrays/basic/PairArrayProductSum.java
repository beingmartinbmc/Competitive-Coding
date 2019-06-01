package arrays.basic;

import java.util.HashSet;
import java.util.Scanner;

class Pair{
    private int a;
    private int b;
    Pair(int a, int b){
        this.a = a;
        this.b = b;
    }
}
public class PairArrayProductSum {
    private static int countPairs(int[] a){
        HashSet<Pair> pair = new HashSet<>();
        int count = 0;
        for(int i=0; i<a.length - 1; i++){
            for(int j=i+1; j<a.length; j++){
                if((a[i] + a[j]) < (a[i] * a[j]) && !pair.contains(new Pair(i, j))) {
                    pair.add(new Pair(i, j));
                    count += 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            int n = input.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++)
                a[i] = input.nextInt();
            System.out.println(countPairs(a));
            t -= 1;
        }
    }
}
