package arrays.medium;

import java.util.*;
import java.lang.*;
import java.io.*;

class Pair{
    private int first;
    private int second;
    private int index;

    Pair(int first, int second, int index){
        this.first = first;
        this.second = second;
        this.index = index;
    }

    public int getFirst(){
        return this.first;
    }

    public int getSecond(){
        return this.second;
    }

    public int getIndex(){
        return this.index;
    }

}
class FrequencySort {
    private static Map<Integer, Integer> getFrequency(int[] a){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : a)
            map.put(i, map.getOrDefault(i, 1) + 1);
        return map;
    }
    private static void sort(int[] a){
        List<Pair> elements = new ArrayList<>();
        Map<Integer, Integer> lookup = getFrequency(a);
        int index = 0;
        for(int i : a)
            elements.add(new Pair(i, lookup.get(i), index++));
        elements.sort((o1, o2) ->{
            int c = Integer.compare(o2.getSecond(), o1.getSecond());
            if(c == 0)
                return Integer.compare(o1.getFirst(), o2.getFirst());
            else
                return c;
        });
        for(Pair p : elements)
            System.out.print(p.getFirst()+" ");
        System.out.println();
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            int n = input.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++)
                a[i] = input.nextInt();
            sort(a);
            t -= 1;
        }
    }
}