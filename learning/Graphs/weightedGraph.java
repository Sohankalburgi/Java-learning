import java.util.*;
public class weightedGraph {
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

        System.out.println(adj);

    }
}
