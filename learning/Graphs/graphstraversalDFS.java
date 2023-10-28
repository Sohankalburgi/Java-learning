import java.util.*;

public class graphstraversalDFS
{
    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // Space Complexity - O(V)
    // Time Complexity - O(Edges+V)
    // No of vertex
    public static int V = 4;
    public static boolean vis[] = new boolean[V];
    public static ArrayList<Integer> ans = new ArrayList<>(); 
    public static void dfs(ArrayList<ArrayList<Integer>> adj,int source) 
    {
        // 1. add the vertex in visited array
        vis[source] = true;

        // 2. add the vertex in the ans list
        ans.add(source);

        // 3. recursive call the dfs on the connected graph
        for(int i : adj.get(source))
        {
            if(vis[i]==false)
            {
                dfs(adj,i);
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        // the Arraylist is created
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);
        
        // creating the new list object 
        for(int i=0;i<V;i++)
        {
            adj.add( new ArrayList<>());
        }

        // the addition of the edge
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,3);
        addEdge(adj,2,3);

        // the list 
        System.out.println(adj);

        // the dfs traversal
        dfs(adj,0);
        System.out.println(ans);
    }
}