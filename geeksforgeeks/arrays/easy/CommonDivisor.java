package arrays.easy;

import java.util.Scanner;

public class CommonDivisor {
    private static int getCount(int a, int b){
        int count = 0;
        for(int i=1; i<=Math.min(a, b); i++){
            if(a % i == 0 && b % i == 0)
                count += 1;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            int p = input.nextInt();
            int q = input.nextInt();
            System.out.println(getCount(p, q));
            t -= 1;
        }
    }
}
