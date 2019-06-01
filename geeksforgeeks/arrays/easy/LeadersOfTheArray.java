package arrays.easy;

import java.util.*;
import java.lang.*;
import java.io.*;

public class LeadersOfTheArray {
    private static void getLeaders(int[] a){
        List<Integer> output = new ArrayList<>();
        int greatest = a[a.length - 1];
        output.add(greatest);
        for(int i = a.length - 2; i >= 0; i--){
            if(a[i] >= greatest){
                greatest = a[i];
                output.add(greatest);
            }
        }
        StringBuffer b = new StringBuffer();
        for(int i=output.size() - 1; i >= 0; i--){
            b.append(output.get(i));
            b.append(" ");
        }
        System.out.println(b);
    }
    public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t > 0){
            int n = Integer.parseInt(br.readLine());
            String[] array = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for(int i=0; i<array.length; i++)
                a[i] = Integer.parseInt(array[i]);
            getLeaders(a);
            t -= 1;
        }
    }
}