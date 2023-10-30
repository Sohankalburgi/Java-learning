import java.util.*;

// Time complexity = O(E log(E))
// Space complexity = O(V+E)

public class Prsim {

    static int spanningTree(int V,ArrayList<ArrayList<ArrayList<Integer>>> adj)
    {
        boolean vis[] = new boolean[V];
        PriorityQueue<int []> pq = new PriorityQueue<>((a,b)-> a[1]-b[1]);  
        pq.add(new int[] {0,0});
        int cost = 0;
        while(!pq.isEmpty())
        {
            int []x =pq.remove();

            if(vis[x[0]]==true)
            {
                continue;
            }
            vis[x[0]] =true;
            cost += x[1];
            for(ArrayList<Integer> i: adj.get(x[0]))
            {
                int v = i.get(0); // neighbour
                int w = i.get(1); // weight

                pq.add(new int []{v,w});
            }

        }
        return cost;
    }
    public static void main(String[] args) {
        // No of vertex
        int V = 4;

        // adjency list
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();

        // new list in list
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<>());
        }

        // define the adjacency list with edges and weights
        // Edges from  vertex 0 to 1 with weight 2
        adj.get(0).add(new ArrayList<>());
        adj.get(0).get(0).add(1);
        adj.get(0).get(0).add(2);


        // Edges from 0 to 2 with weight 3
        adj.get(0).add(new ArrayList<>());
        adj.get(0).get(1).add(2);
        adj.get(0).get(1).add(3);

        // Edges from 1 to 2 with weight 1
        adj.get(1).add(new ArrayList<>());
        adj.get(1).get(0).add(2);
        adj.get(1).get(0).add(1);

        // Edges from 1 to 3 with weight 4
        adj.get(1).add(new ArrayList<>());
        adj.get(1).get(1).add(3);
        adj.get(1).get(1).add(4);

        // Edges from 2 to 3 with weight 5
        adj.get(2).add(new ArrayList<>());
        adj.get(2).get(0).add(3);
        adj.get(2).get(0).add(5);

        int cost = spanningTree(V, adj);
        System.out.println(" the cost :"+cost);

        System.out.println(adj);
    }
}
