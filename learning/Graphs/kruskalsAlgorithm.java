import java.util.*;

// time complexity = O(E log(E))
// Space Complexity = O(V+E)
public class kruskalsAlgorithm {
    
    static int V = 4;
    static int []parent = new int [V];

    static int find(int x)
    {
        if(parent[x]==x)
            return x;
        
        return find(parent[x]);
    }

    static void union(int x,int y)
    {
        int a =find(x);
        int b = find(y);
        parent[b] = a;
    }
    
    static int spanningTree(int V,List<int[]> edges)
    {
        Collections.sort(edges,Comparator.comparingInt(a->a[2]));
        int cost = 0;
        // each parent of vertex is itself in beginning
        for(int i=0;i<V;i++)
        {
            parent[i]=i;
        }

        for(int []i:edges)
        {
            int u = i[0]; //i[0] = start vertex
            int v = i[1]; //i[1] = end vertex
            int w = i[2]; //i[2] = weight

            if(find(u)!=find(v))
            {
                cost+=w;
                union(u,v);
            }
        }
        
        return cost;
    }
    public static void main(String[] args) {
         
        ArrayList<int[]> edges = new ArrayList<>();
        edges.add(new int []{0,1,2});
        edges.add(new int []{0,2,3});
        edges.add(new int []{1,2,1});
        edges.add(new int []{1,3,4});
        edges.add(new int []{2,3,5});
        
        int cost = spanningTree(V,edges);
        System.out.println("Sum of Weights in Spanning Tree:"+cost);

    }
}