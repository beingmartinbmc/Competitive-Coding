package arrays.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MaximumSumProblem {
    private static int solve(int n, Map<Integer, Integer> lookup){
        if(lookup.containsKey(n))
            return lookup.get(n);
        else{
            if(n == 1 || n == 0){
                lookup.put(n, n);
                return n;
            }
            else
                lookup.put(n, Integer.max(n, solve(n/2, lookup) + solve(n/3, lookup) + solve(n/4, lookup)));
            return lookup.get(n);
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder b = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while(t > 0){
            b.append(solve(Integer.parseInt(br.readLine()), new HashMap<>()));
            System.out.println(b);
            t -= 1;
            b.setLength(0);
        }
    }
}
