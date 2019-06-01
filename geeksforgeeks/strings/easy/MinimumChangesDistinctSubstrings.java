package strings.easy;

import java.util.*;
import java.lang.*;
import java.io.*;

public class MinimumChangesDistinctSubstrings {
    private static int getMinimumCount(String s){
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray())
            set.add(c);
        return s.length() - set.size();
    }
    public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuffer b = new StringBuffer();
        while(t > 0){
            String s = br.readLine();
            b.append(getMinimumCount(s));
            System.out.println(b);
            t -= 1;
            b.setLength(0);
        }
    }
}