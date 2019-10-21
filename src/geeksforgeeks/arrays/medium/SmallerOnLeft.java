package geeksforgeeks.arrays.medium;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SmallerOnLeft {
    private static void printAnswer(int[] a){
        StringBuilder b = new StringBuilder();
        b.append(-1);
        b.append(" ");
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 1; i<a.length; i++){
            set.add(a[i-1]);
            Integer result = set.lower(a[i]);
            if(result != null)
                b.append(result);
            else
                b.append(-1);
            b.append(" ");
        }
        System.out.println(b);
    }
    public static void main (String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t > 0){
            String input = br.readLine();
            String[] array = br.readLine().trim().split(" ");
            int[] a = new int[array.length];
            for(int i=0; i<array.length; i++)
                a[i] = Integer.parseInt(array[i]);
            printAnswer(a);
            t -= 1;
        }
    }
}