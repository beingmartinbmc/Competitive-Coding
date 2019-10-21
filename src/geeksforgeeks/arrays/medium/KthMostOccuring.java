package geeksforgeeks.arrays.medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Element{
    private Integer data;
    private Integer freq;

    public Element(Integer data, Integer freq) {
        this.data = data;
        this.freq = freq;
    }

    public Integer getData() {
        return data;
    }

    public Integer getFreq() {
        return freq;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}

class KthOccuring {
    private static int getSum(int[] a, int x){
        int s = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(a).forEach(e->map.put(e, map.getOrDefault(e, 0 ) + 1));
        PriorityQueue<Element> queue = new PriorityQueue<>(Comparator.comparing(Element::getFreq).reversed());
        map.forEach((k,v)->queue.add(new Element(k,v)));
        for(int i=1; i <= x && !queue.isEmpty(); i++)
            s += queue.poll().getFreq();
        return s;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder b = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        while(t > 0){
            int n = Integer.parseInt(br.readLine().trim());
            String[] inputs = br.readLine().trim().split(" ");
            int[] a = new int[inputs.length];
            for(int i=0; i<inputs.length;i++)
                a[i] = Integer.parseInt(inputs[i]);
            int k = Integer.parseInt(br.readLine().trim());
            b.append(getSum(a, k));
            System.out.println(b);
            b.setLength(0);
            t -= 1;
        }
    }
}
