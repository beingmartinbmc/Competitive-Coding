package geeksforgeeks.strings.medium;

import java.util.*;
import java.lang.*;
import java.io.*;

public class WordBreak {
    private static boolean wordBreak(String s, int d, Set<String> words, Set<Integer> cache){
        if(d == s.length()) return true;
        if(cache.contains(d)) return false;
        for(String word : words){
            if(s.startsWith(word, d)){
                if(wordBreak(s, d + word.length(), words, cache)) return true;
                cache.add(d + word.length());
            }
        }
        return false;
    }
    public static void main (String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t > 0){
            int n = Integer.parseInt(br.readLine());
            String[] words = br.readLine().split(" ");
            Set<String> dict = new HashSet<>(Arrays.asList(words));
            String s = br.readLine().trim();
            System.out.println(wordBreak(s, 0, dict, new HashSet<>()) ? 1 : 0);
            t -= 1;
        }
    }
}