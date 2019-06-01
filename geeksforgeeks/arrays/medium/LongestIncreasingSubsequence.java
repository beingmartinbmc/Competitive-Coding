package arrays.medium;

import java.util.*;
import java.lang.*;
import java.io.*;

public class LongestIncreasingSubsequence {
    private static Integer getLength(Integer[] a){
        Integer[] lis = new Integer[a.length];
        Arrays.fill(lis, 1);
        for(int i=1; i < a.length; i++){
            int j = 0;
            while(j < i){
                if(a[j] < a[i])
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                j += 1;
            }
        }
        return Collections.max(Arrays.asList(lis));
    }
    public static void main (String[] args)throws IOException {
        StringBuilder b = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t > 0){
            int n = Integer.parseInt(br.readLine());
            String[] array = br.readLine().trim().split(" ");
            Integer[] a = new Integer[n];
            for(int i=0; i<n; i++)
                a[i] = Integer.parseInt(array[i]);
            b.append(getLength(a));
            System.out.println(b);
            t -= 1;
            b.setLength(0);
        }
    }
}