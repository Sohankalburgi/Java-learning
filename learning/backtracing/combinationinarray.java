import java.util.*;

public class combinationinarray {

    static void helper(int []arr,int n,int k,ArrayList<Integer> comb,ArrayList<ArrayList<Integer>> res,int inc)
    {
        if(comb.size()==k)
        {
            res.add(new ArrayList<>(comb));
            return;
        }
        for(int i=inc;i<n;i++)
        {
            comb.add(arr[i]);
            helper(arr, n, k, comb, res, i+1);
            comb.remove(comb.size()-1);
        }
    }
    static ArrayList<ArrayList<Integer>> comb(int []arr,int n,int k)
    {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        helper(arr,n,k,new ArrayList<>(),res,0);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k =sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(comb(arr,n,k));
    }
}
