package geeksforgeeks.arrays.basic;

import java.util.Scanner;

public class CoprimeArray {
    private static boolean isPrime(int a){
        if(a == 2 || a == 3)
            return true;
        else if(a % 2 == 0 || a % 3 == 0 || a == 1)
            return false;
        else{
            for(int i=5; i <= (int)Math.sqrt(a); i += 6){
                if(a % i == 0)
                    return false;
            }
        }
        return true;
    }

    private static int countPrimes(int[] a){
        int count = 0;
        for(int i : a)
            if(isPrime(i))
                count += 1;
        return count;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            int n = input.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++)
                a[i] = input.nextInt();
            System.out.println(countPrimes(a));
            t -= 1;
        }
    }
}
