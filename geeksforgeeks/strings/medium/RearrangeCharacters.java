import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.io.*;

class Element{
    private char value;
    private int freq;

    public Element(char value, int freq) {
        this.value = value;
        this.freq = freq;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }
}

class Rearrange{
    private static int rearrange(String s){
        StringBuilder output = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        s.chars().forEach(e->map.put((char)e, map.getOrDefault((char)e, 0) + 1));
        PriorityQueue<Element> queue = new PriorityQueue<>(Comparator.comparing(Element::getFreq).reversed());
        map.forEach((k,v)->queue.add(new Element(k, v)));
        Element prev = new Element('#', -1);
        while(!queue.isEmpty()){
            Element current = queue.poll();
            output.append(current.getValue());
            if(prev.getFreq() > 0) queue.add(prev);
            current.setFreq(current.getFreq() - 1);
            prev = current;
        }
        return output.length() == s.length() ? 1 : 0;
    }

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t > 0){
            String s = br.readLine().trim();
            System.out.println(rearrange(s));
            t -= 1;
        }
    }
}
