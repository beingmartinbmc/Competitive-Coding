import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    private static void addToSet(long[] a, Set<Long> set){
        Arrays.stream(a).forEach(set::add);
    }
    private static String getElements(long[] a, long[] b){
        Set<Long> x = new HashSet<>();
        StringBuilder z = new StringBuilder();
        addToSet(b, x);
        for(long i : a){
            if(!x.contains(i)){
                z.append(i);
                z.append(" ");
            }
        }
        return z.toString().trim();
    }
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t > 0){
		    String line = br.readLine();
		    String[] inputOne = br.readLine().trim().split(" ");
		    String[] inputTwo = br.readLine().trim().split(" ");
		    long[] a = new long[inputOne.length];
		    for(int i=0; i<inputOne.length; i++)
		        a[i] = Long.parseLong(inputOne[i]);
		    long[] b = new long[inputTwo.length];
		    for(int i=0; i<inputTwo.length; i++)
		        b[i] = Long.parseLong(inputTwo[i]);
		    System.out.println(getElements(a, b));
		    t -= 1;
		}
	}
}
