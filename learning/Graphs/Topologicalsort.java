import java.util.ArrayList;
import java.util.Stack;

// Time complexity = O(E+V)
// Space Complexity - O(V)

public class Topologicalsort {

    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        // directed graphs
        adj.get(u).add(v);
    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj,int x,boolean []vis,Stack<Integer> st,int []ans)
    {
        vis[x]=true;
        
        for(int i: adj.get(x))
        {
            if(vis[i]==false)
            {
                dfs(adj, i, vis, st, ans);
            }
        }
        st.push(x);
    }

    public static int [] TopologicSort (ArrayList<ArrayList<Integer>> adj,int V)
    {
        int []ans = new int[V];
        boolean []vis = new boolean[V];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<V;i++)
        {
            if(vis[i]==false)
            {
                dfs(adj,i,vis,st,ans);
            }
        }
        for(int i=0;i<V;i++)
        {
            ans[i] = st.pop();
        }
        return ans;
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

        System.out.println(adj);
        int [] ans = TopologicSort(adj, V);
        for(int i : ans)
        {
            System.out.print(i+" ");
        }
    }
}
