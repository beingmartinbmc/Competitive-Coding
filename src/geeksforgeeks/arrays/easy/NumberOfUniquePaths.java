package geeksforgeeks.arrays.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class NumberOfUniquePaths {
    private static int count(int m, int n, Map<String, Integer> lookup){
        String key = m + " -> " + n;
        if(lookup.containsKey(key))
            return lookup.get(key);
        else{
            if(m == 1 || n == 1){
                lookup.put(key, 1);
                return 1;
            }
            else
                lookup.put(key, count(m - 1, n ,lookup) + count(m, n-1, lookup));
        }
        return lookup.get(key);
    }
    public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder b = new StringBuilder();
        while(t > 0){
            String[] inputs = br.readLine().trim().split(" ");
            b.append(count(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]), new HashMap<>()));
            System.out.println(b);
            t -= 1;
            b.setLength(0);
        }
    }
}
