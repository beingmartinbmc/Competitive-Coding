package arrays.easy;

import java.util.*;
import java.lang.*;
import java.io.*;

public class MinimumWindow{
    private static Map<Character, Integer> getMapping(String t){
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);
        return map;
    }
    private static String getString(String s, String t){
        int i = 0, j = 0, l = 0, r = 0;
        boolean found = false;
        Map<Character, Integer> need = getMapping(t);
        int missing = t.length();
        while(r < s.length()){
            char rightPointer = s.charAt(r);
            if(!need.containsKey(rightPointer))
                need.put(rightPointer, -1);
            if(need.get(rightPointer) > 0)
                missing -= 1;
            need.put(rightPointer, need.get(rightPointer) - 1);
            r += 1;
            while(missing == 0){
                if(j == 0 || (r - l) < (j - i)){
                    i = l;
                    j = r;
                    found = true;
                }
                char leftPointer = s.charAt(l);
                if(!need.containsKey(leftPointer))
                    need.put(leftPointer, -1);
                need.put(leftPointer, need.get(leftPointer) + 1);
                if(need.get(leftPointer) > 0)
                    missing += 1;
                l += 1;
            }
        }
        return found ? s.substring(i, j) : "-1";
    }
	public static void main (String[] args)throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t > 0){
		    String s = br.readLine();
		    String x = br.readLine();
		    System.out.println(getString(s, x));
		    t -= 1;
		}
	}
}