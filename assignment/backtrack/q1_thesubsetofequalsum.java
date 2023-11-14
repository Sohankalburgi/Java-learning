import java.util.*;

public class q1_thesubsetofequalsum {

    static boolean equalsumsubset(int []arr,int n,int k,int sum,ArrayList<Integer> container,int i,ArrayList<Integer> result)
    {
        // base case
        if(result.size()==k)
        {
            conta
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        ArrayList <Integer> result = new ArrayList<>();
        System.out.println("The condition is possible :"+equalsumsubset(arr,n,k,0,new ArrayList<Integer>(),1,result));
    }
}