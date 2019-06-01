package arrays.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {
    private static LinkedHashSet<Character> removeDuplicates(String s){
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char c : s.toCharArray())
            set.add(c);
        return set;
    }
    private static void printAnswer(String s){
        LinkedHashSet<Character> set = removeDuplicates(s);
        for(char c : set)
            System.out.print(c);
        System.out.println();
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String s = br.readLine();
            printAnswer(s);
            t -= 1;
        }
    }
}
