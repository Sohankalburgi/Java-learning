import java.util.ArrayList;

public class UndirectedCycleDetectioninGraphs
{
    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        // directed graphs
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    
    public static boolean dfs(ArrayList<ArrayList<Integer>> adj,boolean []vis,int source,int parent)
    {
        // mark the vertex as visited
        vis[source] = true;

        for(int i : adj.get(source))
        {
            if(vis[i]==false)
            {
                if(dfs(adj,vis,i,source))
                {
                    return true;
                }
            }
            else if(vis[i]==true && i!=parent)
            {
                return true;
            }
        }
        return false;
    }
    // Cycle detection implementation
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(vis[i]==false)
            {
                if(dfs(adj,vis,i,-1)==true)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
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

        System.out.println(isCycle(V, adj));
        System.out.println(adj);
    }
}