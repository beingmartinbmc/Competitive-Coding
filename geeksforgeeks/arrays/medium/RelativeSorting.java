package arrays.medium;

import java.util.*;
import java.lang.*;
import java.io.*;

public class RelativeSorting {
    private static Map<Integer, Integer> getMapping(int[] a){
        Map<Integer, Integer> lookup = new HashMap<>();
        for(int i : a)
            lookup.put(i, lookup.getOrDefault(i, 0) + 1);
        return lookup;
    }
    private static void sort(int[] a, int[] b){
        Map<Integer, Integer> lookup = getMapping(a);
        List<Integer> output = new ArrayList<>();
        for(int i : b){
            if(lookup.containsKey(i)){
                for(int j=1; j<= lookup.get(i); j++)
                    output.add(i);
                lookup.remove(i);
            }   
        }
        List<Integer> temp = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : lookup.entrySet()){
            for(int j = 1; j <= entry.getValue(); j++)
                temp.add(entry.getKey());
        }
        temp.sort(Comparator.naturalOrder());
        output.addAll(temp);
        StringBuffer z = new StringBuffer();
        for(int i : output){
            z.append(i);
            z.append(" ");
        }
        System.out.println(z);
    }
	public static void main (String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t > 0){
		    String[] inputs = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputs[0]);
		    int m = Integer.parseInt(inputs[1]);
		    String[] arrayOne = br.readLine().trim().split(" ");
		    int[] a = new int[n];
		    int[] b = new int[n];
		    for(int i=0; i<n; i++)
		        a[i] = Integer.parseInt(arrayOne[i]);
		    String[] arrayTwo = br.readLine().trim().split(" ");
		    for(int i=0; i<m; i++)
		        b[i] = Integer.parseInt(arrayTwo[i]);
		    sort(a, b);
		    t -= 1;
		}
	}
}