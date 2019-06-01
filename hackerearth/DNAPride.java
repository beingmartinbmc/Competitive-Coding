import java.util.*;
import java.io.*;

class DNA{
    private static String solve(String s){
        HashSet<Character> set = new HashSet<>();
        set.add('A');set.add('C');set.add('G');set.add('T');
        StringBuilder b = new StringBuilder();
        for(char c : s.toCharArray()){
            if(!set.contains(c))
                return "Error RNA nucleobases found!";
            else{
                if(c == 'A') b.append('T');
                if(c == 'T') b.append('A');
                if(c == 'G') b.append('C');
                if(c == 'C') b.append('G');
            }
        }
        return b.toString();
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder b = new StringBuilder();
        while(t > 0){
            int n = Integer.parseInt(br.readLine().trim());
            b.append(solve(br.readLine()));
            System.out.println(b);
            t -= 1;
            b.setLength(0);
        }
    }
}
