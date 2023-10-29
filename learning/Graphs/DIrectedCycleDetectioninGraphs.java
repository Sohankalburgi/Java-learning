import java.util.ArrayList;

// time Complexity - O(V+E)
// Space Complexity - O(V)
public class DIrectedCycleDetectioninGraphs {

    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
    }

    // cycle logic 
    public static boolean dfs(boolean []vis,boolean []dfsvis,int source,ArrayList<ArrayList<Integer>> adj)
    {
        // mark the vertex as visited
        vis[source] = true;
        dfsvis[source] = true;

        for(int i : adj.get(source))
        {
            if(vis[i]==false)
            {
                // this return true is for the traversal
                if(dfs(vis,dfsvis,i,adj))
                {
                    return true;
                }
            }
            // this true is for the cycle detection 
            else if(vis[i]==true && dfsvis[i]==true)
            {
                return true;
            }
        }
        dfsvis[source]=false;
        return false;
    }

    public static boolean isCycle(ArrayList<ArrayList<Integer>> adj,int V)
    {
        // visited boolean array and dfs visited array to keep track
        boolean vis[] = new boolean[V];
        boolean dfsvis[] = new boolean [V];

        for(int i=0;i<V;i++)
        {
            if(vis[i]==false)
            {
                // if the dfs traversal finds the cycle
                if(dfs(vis,dfsvis,i,adj))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<>());
        }
        
        addEdge(adj,0,1);
        addEdge(adj,2,0);
        addEdge(adj,0,3);
        addEdge(adj,3,2);

        System.out.println(adj);
        System.out.println("the Cycle exist :"+ isCycle(adj, V));
    
    }
}
