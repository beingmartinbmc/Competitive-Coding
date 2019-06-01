import java.util.*;
import java.io.*;

public class SnakesAndLadder{
    private List<Integer>[] list;
    private int n;

    private SnakesAndLadder(int n){
        this.n = n;
        list = new ArrayList[n];
        for(int i=0; i<n; i++)
            list[i] = new ArrayList<>();
    }

    private void addEdge(int u, int v){
         list[u].add(v);
    }

    private void bfs(int source, int destination){
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> output = new ArrayList<>();
        boolean[] visited = new boolean[n];
        int[] distance = new int[n];
        queue.add(source);
        visited[source] = true;
        while(!queue.isEmpty()){
            int current = queue.poll();
            for(int x : list[current]){
                if(!visited[x]){
                    distance[x] = distance[current] + 1;
                    visited[x] = true;
                    queue.add(x);
                }
            }
        }
        StringBuilder b = new StringBuilder();
        b.append(distance[destination]);
        System.out.println(b);
    }

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t > 0){
            String line = br.readLine();
            String[] inputs = br.readLine().trim().split(" ");
            SnakesAndLadder g = new SnakesAndLadder(31);
            int[] board = new int[31];
            for(int i=0; i<inputs.length-1; i+=2){
                int from = Integer.parseInt(inputs[i]);
                int to = Integer.parseInt(inputs[i + 1]);
                board[from] = to - from;
            }
            for(int u=0; u<30; u++){
                for(int dice = 1; dice <= 6; dice++){
                    int x = u + dice;
                    if(x <= 30){
                        int v = x + board[x];
                        g.addEdge(u, v);
                    }
                }
            }
            g.bfs(1, 30);
            t -= 1;
        }
    }
}
