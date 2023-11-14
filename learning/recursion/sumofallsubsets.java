import java.util.*;

public class sumofallsubsets {

    static void sumOfSubsets(int []arr,int n,ArrayList<Integer> res,int idx,int sum)
    {
        // base case when the idx traverse each element each at a time and reaches at last
        if(idx==n)
        {
            res.add(sum);
            return;
        }
        sumOfSubsets(arr, n, res, idx+1, sum+arr[idx]);
        sumOfSubsets(arr, n, res, idx+1, sum);

    }

    static ArrayList<Integer> sumOfSubsets(int []arr,int n)
    {
        ArrayList<Integer> res = new ArrayList<>();
        sumOfSubsets(arr,n,res,0,0);
        return res;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("the sum of subset"+ sumOfSubsets(arr,n));
    }
}
