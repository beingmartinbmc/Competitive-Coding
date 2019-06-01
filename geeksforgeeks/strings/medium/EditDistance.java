
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    private static int min(int ... a){
        int m = Integer.MAX_VALUE;
        for(int i : a)
            m = Math.min(i, m);
        return m;
    }
    
    private static int getDistance(String a, String b, int n, int m, HashMap<String, Integer> lookup){
        String key = n + " -> " + m;
        if(lookup.containsKey(key))
            return lookup.get(key);
        else{
            if(n == 0) return m;
            if(m == 0) return n;
            else{
                if(a.charAt(n - 1) == b.charAt(m - 1))
                    lookup.put(key, getDistance(a, b, n-1, m-1, lookup));
                else
                    lookup.put(key, min(getDistance(a, b, n-1, m-1, lookup), getDistance(a, b, n-1, m, lookup), getDistance(a, b, n, m-1, lookup)) + 1);
            }
            return lookup.get(key);
        }
    }
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder b = new StringBuilder();
		while(t > 0){
		    String[] inputs = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputs[0]);
		    int m = Integer.parseInt(inputs[1]);
		    String[] strings = br.readLine().trim().split(" ");
		    b.append(getDistance(strings[0], strings[1], n, m, new HashMap<>()));
		    System.out.println(b);
		    t -= 1;
		    b.setLength(0);
		}
	}
}
