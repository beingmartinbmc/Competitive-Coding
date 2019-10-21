package geeksforgeeks.arrays.easy;

import java.util.ArrayList;
import java.util.Scanner;

public class NthNumberPrimeDigits {
    private static ArrayList<Integer> buildDigits(){
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);primes.add(3);primes.add(5);primes.add(7);
        ArrayList<Integer> PRIMES = new ArrayList<>(primes);
        for(int i : primes){
            for(int j : primes)
                    PRIMES.add(Integer.parseInt(Integer.toString(i) + Integer.toString(j)));
        }
        for(int i : primes){
            for(int j : primes)
                for(int k : primes)
                    PRIMES.add(Integer.parseInt(Integer.toString(i) + Integer.toString(j) + Integer.toString(k)));
        }
        for(int i : primes){
            for(int j : primes)
                for(int k : primes)
                    for(int l :primes)
                        PRIMES.add(Integer.parseInt(Integer.toString(i) + Integer.toString(j) + Integer.toString(k) + Integer.toString(l)));
        }
        return PRIMES;
    }
    public static void main(String[] args){
        ArrayList<Integer> primes = buildDigits();
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            System.out.println(primes.get(input.nextInt() - 1));
            t -= 1;
        }
    }
}
