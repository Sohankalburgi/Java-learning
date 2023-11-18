import java.util.*;
// Time complexity - O(n)
// Space complexity - O(n)
public class subsetusingbacktracking {

   static void subsetsbybacktrack(ArrayList<ArrayList<Integer>> result,int n,int []arr, int index,ArrayList<Integer> container)
   {
      
     result.add(new ArrayList<>(container));
        
      for(int i=index;i<n;i++)
      {
         container.add(arr[i]);
         subsetsbybacktrack(result, n, arr, i+1, container);
         container.remove(container.size()-1);
      }
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int []arr = new int[n];
      for(int i=0;i<n;i++)
      {
         arr[i] = sc.nextInt();
      }
      ArrayList<ArrayList<Integer>> result = new ArrayList<>();
      subsetsbybacktrack(result,n,arr,0,new ArrayList<>());
      System.out.println(result);
   } 
}
