package geeksforgeeks.arrays.basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class EquivalentSubarrays {
    private static ArrayList<String> getSubarrays(int[] a){
        ArrayList<String> list = new ArrayList<>();
        StringBuilder b = new StringBuilder();
        for(int i=0; i<a.length; i++){
            b.setLength(0);
            for(int j=i; j<a.length; j++){
                b.append(a[j]);
                b.append(" ");
                list.add(b.toString());
            }
        }
        return list;
    }

    private static int getCount(int[] a){
        int count = 0;
        ArrayList<String> subarrays = getSubarrays(a);
        HashSet<Integer> distinct = new HashSet<>();
        for(int i : a)
            distinct.add(i);
        for(String w : subarrays){
            HashSet<Integer> set = new HashSet<>();
            for(String c : w.split(" "))
                set.add(Integer.parseInt(c));
            if(set.size() == distinct.size())
                count += 1;
        }
        return count;
    }

    private static void takeInput(){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            int n = input.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++)
                a[i] = input.nextInt();
            System.out.println(getCount(a));
            t -= 1;
        }
    }
    public static void main(String[] args){
        takeInput();
    }
}
