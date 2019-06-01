import java.util.*;
import java.io.*;

class TestClass {
    private static boolean canBe(String a, String b){
        if(a.length() != b.length()) return false;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) > b.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine().trim();
        String y = br.readLine().trim();
        if(canBe(x, y))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
