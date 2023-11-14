import java.util.*;
// the permutation of an array containing duplicate element
public class q3_permutationwithduplicates {

    public static void helper(ArrayList<ArrayList<Integer>> res,ArrayList<Integer> perm,boolean []check,int []arr)
    {
        if(perm.size()==arr.length)
        {
            res.add(new ArrayList<>(perm));
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(check[i]==true)
                continue;
            perm.add(arr[i]);
            check[i] = true;
            helper(res, perm, check, arr);
            check[i] = false;
            perm.remove(perm.size()-1);
            

            while(i+1<arr.length && arr[i]==arr[i+1])
            {
                i++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }

        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res= new ArrayList<>();
        boolean []check = new boolean[n];
    
        helper(res,new ArrayList<>(),check,arr);
        System.out.println(res);
    }
}
