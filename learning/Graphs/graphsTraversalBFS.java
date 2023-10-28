import java.util.*;
public class graphsTraversalBFS
{
    // creation of graph
    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        // directed graphs
        adj.get(u).add(v);
    }

    // BFS traversal of graphs
    // Time Complexity - O(Edges+V)
    // Space Complexity - O(V)
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj,int V)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        boolean vis[] = new boolean[V];
        while(!q.isEmpty())
        {
            int x = q.poll();
            if(vis[x]==false)
            {
                vis[x]=true;
                ans.add(x);
                for(int i :adj.get(x))
                {
                    q.add(i);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // No of vertex
        int V = 5;

        // adjency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);

        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<>());
        }

        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,0,3);
        addEdge(adj,2,4);

        System.out.println(adj);
        System.out.println(bfs(adj,V));
    
    }
}