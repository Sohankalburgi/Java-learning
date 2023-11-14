import java.util.*;
public class q2_permutationinarray {

    public static void backtrack(ArrayList<ArrayList<Integer>> res,ArrayList<Integer> perm,int []arr)
    {
        if(perm.size()==arr.length){
            res.add(new ArrayList<>(perm));
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(perm.contains(arr[i]))
                continue;
            perm.add(arr[i]);
            backtrack(res, perm, arr);
            perm.remove(perm.size()-1);
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
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        backtrack(res,new ArrayList<>(),arr);
        System.out.println(res);
    }
}
