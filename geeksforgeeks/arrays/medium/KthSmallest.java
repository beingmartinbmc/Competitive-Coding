package arrays.medium;

import java.util.*;

public class KthSmallest {
    private static int getRandom(int upper, int lower){
        return (int)(Math.random() * (upper - lower + 1)) + lower;
    }
    private static void swap(int[] a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    private static int partition(int[] a, int low, int high, int pIndex){
        int i = low - 1;
        int pivot = a[pIndex];
        swap(a, pIndex, high);
        for(int j = low; j <= high - 1; j++){
            if(a[j] < pivot){
                i += 1;
                swap(a, i, j);
            }
        }
        swap(a, i+1, high);
        return i + 1;
    }
    private static int quickSelect(int[] a, int left, int right, int k){
        if(left == right)
            return a[left];
        int pIndex = getRandom(left, right);
        int pivot = partition(a, left, right, pIndex);
        if(k == pivot)
            return a[k];
        else if(k < pivot)
            return quickSelect(a, left, pivot - 1, k);
        else
            return quickSelect(a, pivot + 1, right, k);
    }
	public static void main (String[] args) {
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    while(t > 0){
	        int n = input.nextInt();
	        int[] a = new int[n];
	        for(int i=0; i<n; i++)
	            a[i] = input.nextInt();
	        int k = input.nextInt();
	        System.out.println(quickSelect(a, 0, a.length - 1, k - 1));
	        t -= 1;
	    }
	}
}
