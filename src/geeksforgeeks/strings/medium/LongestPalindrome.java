package geeksforgeeks.strings.medium;

import java.io.*;

public class LongestPalindrome{
    private static String max(String a, String b){
        return a.length() > b.length() ? a : b;
    }
    private static String expand(String s, int start, int end){
        while(start >= 0 && end < s.length() && (s.charAt(start) == s.charAt(end))){
            start -= 1;
            end += 1;
        }
        return s.substring(start + 1, end);
    }

    private static String getPalindrome(String s){
        if(s.isEmpty()) return null;
        if(s.length() == 1) return s;
        String result = s.substring(0, 1);
        for(int i=0; i<s.length(); i++){
            String temp = expand(s, i, i);
            result = max(temp, result);
            temp = expand(s, i, i + 1);
            result = max(temp, result);
        }
        return result;
    }

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder b = new StringBuilder();
        while(t > 0){
            String s = br.readLine().trim();
            b.append(getPalindrome(s));
            System.out.println(b);
            b.setLength(0);
            t -= 1;
        }
    }
}