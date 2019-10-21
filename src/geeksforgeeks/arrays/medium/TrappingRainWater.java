package geeksforgeeks.arrays.medium;

import java.util.*;
import java.lang.*;
import java.io.*;

public class TrappingRainWater{
    private static int[] getLeftHeights(int[] a){
        int[] left = new int[a.length];
        left[0] = a[0];
        for(int i = 1; i<a.length; i++)
            left[i] = Math.max(a[i], left[i-1]);
        return left;
    }
    private static int[] getRightHeights(int[] a){
        int[] right = new int[a.length];
        right[a.length - 1] = a[a.length - 1];
        for(int i = a.length - 2; i>=0; i--)
            right[i] = Math.max(a[i], right[i+1]);
        return right;
    }
    private static int getWaterQuantity(int[] a){
        int[] leftHeights = getLeftHeights(a);
        int[] rightHeights = getRightHeights(a);
        int total = 0;
        for(int i=0; i<a.length; i++)
            total += Math.min(leftHeights[i], rightHeights[i]) - a[i];
        return total;
    }
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t > 0){
		    int n = Integer.parseInt(br.readLine());
		    int[] a = new int[n];
		    String[] lines = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++)
		        a[i] = Integer.parseInt(lines[i]);
		    StringBuffer s  = new StringBuffer();
		    s.append(getWaterQuantity(a));
		    System.out.println(s);
		    t -= 1;
		}
	}
}