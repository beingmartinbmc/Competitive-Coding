package arrays.medium;

import java.util.*;
import java.lang.*;
import java.io.*;

public class LongestCommonSubsequence {
    private static int getCount(String a, String b, int n, int m, HashMap<String, Integer> lookup){
        String key = n + " -> " + m;
        if(lookup.containsKey(key))
            return lookup.get(key);
        else{
            if(n == 0 || m == 0){
                lookup.put(key, 0);
                return 0;
            }
            else{
                if(a.charAt(n - 1) == b.charAt(m - 1))
                    lookup.put(key, 1 + getCount(a, b, n - 1, m - 1, lookup));
                else
                    lookup.put(key, Math.max(getCount(a, b, n-1, m, lookup), getCount(a, b, n, m-1, lookup)));
            }
            return lookup.get(key);
        }
    }
    private static int getLCSLength(String a, String b){
        return getCount(a, b, a.length(), b.length(), new HashMap<>());
    }
    public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder x = new StringBuilder();
        while(t > 0){
            String inputs = br.readLine();
            String a = br.readLine();
            String b = br.readLine();
            x.append(getLCSLength(a, b));
            t -= 1;
            System.out.println(x);
            x.setLength(0);
        }
    }
}