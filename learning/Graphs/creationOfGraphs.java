import java.util.*;
public class creationOfGraphs
{
    public static void addEdge(ArrayList<ArrayList<Integer>> AL,int u,int v)
    {
        // for Undirectional graph
        AL.get(u).add(v);
        AL.get(v).add(u);
    }
    public static void main(String[] args) {
        // No of vertices in the graph
        int V = 4;
        //create the adjacency list
        ArrayList<ArrayList<Integer>> AL = new ArrayList<>(V);
        
        // to create the list inside the list basically an object creation of list in list 
        for(int i=0;i<V;i++)
        {
            AL.add(new ArrayList<Integer>());
        }
        //Add edge  is function of the graph creation of nodes/Vertex
        addEdge(AL,0,1);
        addEdge(AL,0,2);
        addEdge(AL,1,3);
        addEdge(AL,2,3);

        // the Graph representation in adjcency Lists
        System.out.println(AL);

    }
}