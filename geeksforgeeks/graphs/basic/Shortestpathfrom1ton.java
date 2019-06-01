import java.util.*;
import java.io.*;

class Graph{
    private List<Integer>[] list;
    private int n;

    private Graph(int n){
        this.n = n;
        list = new ArrayList[n];
        for(int i=0; i<n; i++)
            list[i] = new ArrayList<>();
    }

    private void addEdge(int u, int v){
        list[u].add(v);
    }

    private int bfs(int source, int destination){
        Queue<Integer> queue = new LinkedList<>();
        int[] distance = new int[n];
        boolean[] visited = new boolean[n];
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
        return distance[destination];
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder b = new StringBuilder();
        while(t > 0){
            int n = Integer.parseInt(br.readLine());
            Graph g = new Graph(n + 1);
            for(int i=1; i <= n; i++){
                if(i + 1 <= n)
                    g.addEdge(i, i+1);
                if(3 * i <= n)
                    g.addEdge(i, 3*i);
            }
            b.append(g.bfs(1, n));
            System.out.println(b);
            b.setLength(0);
            t -= 1;
        }
    }
}
