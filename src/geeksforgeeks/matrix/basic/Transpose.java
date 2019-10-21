package geeksforgeeks.matrix.basic;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            int n = input.nextInt();
            int[][] a = new int[n][n];
            for(int i=0; i<n; i++)
                for(int j=0; j<n; j++)
                    a[i][j] = input.nextInt();
            for(int i=0; i<n; i++)
                for(int j=0; j<n; j++)
                    System.out.print(a[j][i]+" ");
                System.out.println();
            t -= 1;
        }
    }
}
