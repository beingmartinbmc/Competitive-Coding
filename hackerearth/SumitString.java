import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    private static boolean isValid(String s){
        for(int i=0; i<s.length() -1; i++){
            int difference = Math.abs(s.charAt(i) - s.charAt(i + 1));
            if(difference >= 13) difference = 26 - difference;
            if(difference != 1)
                return false;
        }
        return true;
    }
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t > 0){
            System.out.println(isValid(br.readLine().trim()) ? "YES" : "NO");
            t -= 1;
        }
    }
}
