import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class DijkstrasAlgorithm {
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        boolean [] vis = new boolean[V];
        int [] ans = new int [V];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[1]-b[1]);
        
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[S] = 0;
        
        pq.add(new int[] {S,0});
        
        while(!pq.isEmpty())
        {
            int []x = pq.remove();
            int vertex = x[0];
            if(vis[vertex]==true)
                continue;
            vis[vertex] = true;
            
            for(ArrayList<Integer> i : adj.get(vertex))
            {
                int v = i.get(0);
                int w = i.get(1);
                
                if(ans[vertex]+w < ans[v])
                {
                    ans[v] = ans[vertex]+w;
                }
                pq.add(new int[]{v,ans[v]});
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
