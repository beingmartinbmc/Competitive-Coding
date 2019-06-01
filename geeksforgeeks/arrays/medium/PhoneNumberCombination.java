package arrays.medium;

import java.util.*;
import java.lang.*;
import java.io.*;

public class PhoneNumberCombination {
    private static void printWords(int[] digits, List<List<Character>> words, int index, String result){
        if(index == digits.length){
            System.out.print(result+" ");
            return;
        }
        int digit = digits[index];
        int size = words.get(digit).size();
        for(int i=0; i<size; i++)
            printWords(digits, words, index + 1, result + words.get(digit).get(i));
    }
	public static void main (String[] args) {
		List<List<Character>> words = Arrays.asList(
                Collections.emptyList(),
                Collections.emptyList(),
                Arrays.asList('a', 'b','c'),
                Arrays.asList('d', 'e','f'),
                Arrays.asList('g', 'h','i'),
                Arrays.asList('j', 'k','l'),
                Arrays.asList('m', 'n','o'),
                Arrays.asList('p', 'q','r', 's'),
                Arrays.asList('t', 'u','v'),
                Arrays.asList('w', 'x','y', 'z')
        );
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            int n = input.nextInt();
            int[] digits = new int[n];
            for(int i=0; i<n; i++)
                digits[i] = input.nextInt();
            printWords(digits, words, 0, "");
            System.out.println();
            t -= 1;
        }
	}
}
