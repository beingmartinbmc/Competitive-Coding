package geeksforgeeks.arrays.hard;

import java.util.*;
import java.io.*;

class Ugly{
    private static List<Long> uglies = new ArrayList<>();

    private static void generate(){
        TreeSet<Long> set = new TreeSet<>();
        set.add(1L);
        for(int i=1; i<=10000; i++){
            long c = set.first();
            uglies.add(c);
            set.add(2 * c);
            set.add(3 * c);
            set.add(5 * c);
            set.remove(c);
        }
    }

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        generate();
        int t = Integer.parseInt(br.readLine().trim());
        while(t > 0){
            int n = Integer.parseInt(br.readLine().trim());
            System.out.println(uglies.get(n - 1));
            t -= 1;
        }
    }
}