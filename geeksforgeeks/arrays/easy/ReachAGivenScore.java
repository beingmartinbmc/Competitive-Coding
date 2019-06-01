package arrays.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ReachAGivenScore {
    private static long count(final int[] scores, int sum, int items, Map<String, Long> lookup){
        String key = sum + " -> " + items;
        if(lookup.containsKey(key))
            return lookup.get(key);
        else{
            if(sum == 0){
                lookup.put(key, 1L);
                return 1;
            }
            if(sum < 0 || items < 0){
                lookup.put(key, 0L);
                return 0;
            }
            else{
                long include = count(scores, sum - scores[items], items, lookup);
                long exclude = count(scores, sum, items - 1, lookup);
                lookup.put(key, include + exclude);
            }
            return lookup.get(key);
        }
    }
    public static void main(String[] args)throws IOException {
        final int[] scores = {3, 5, 10};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder b = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while(t > 0){
            int sum = Integer.parseInt(br.readLine());
            b.append(count(scores, sum, scores.length - 1, new HashMap<>()));
            System.out.println(b);
            t -= 1;
            b.setLength(0);
        }
    }
}
