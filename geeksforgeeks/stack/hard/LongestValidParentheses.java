import java.util.*;
import java.io.*;

class Parentheses{
    private static boolean isOpening(char a){
        return a == '(' || a == '{' || a == '[';
    }

    private static boolean isClosing(char a){
        return a == ')' || a == '}' || a == ']';
    }

    private static int getLength(String s){
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int answer = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(isOpening(c)) stack.push(i);
            else{
                stack.pop();
                if(!stack.isEmpty())
                    answer = Math.max(answer, i - stack.peek());
                else
                    stack.push(i);
            }
        }
        return answer;
    }

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t > 0){
            System.out.println(getLength(br.readLine().trim()));
            t -= 1;
        }
    }
}
