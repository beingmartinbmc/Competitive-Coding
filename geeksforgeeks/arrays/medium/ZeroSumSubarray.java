package arrays.medium;

import java.util.*;
import java.lang.*;
import java.io.*;

public class ZeroSumSubarray {
    private static int getCount(int[] a){
        HashMap<Integer, Integer> map = new HashMap<>();
        int s = 0, count = 0;
        for(int i : a){
            s += i;
            if(s == 0)
                count += 1;
            if(map.containsKey(s)){
                count += map.get(s);
                map.put(s, map.get(s) + 1);
            }
            else
                map.put(s, 1);
        }
        return count;
    }
    public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t > 0){
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            String line = br.readLine();
            String[] lines = line.trim().split("\\s+");
            for(int i=0; i<lines.length; i++)
                a[i] = Integer.parseInt(lines[i]);
            System.out.println(getCount(a));
            t -= 1;
        }
    }
}