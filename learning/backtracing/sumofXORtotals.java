import java.util.Scanner;

public class sumofXORtotals {
    static public int subsetXORSum(int[] nums) {
        int sum = subsetXORSum(nums,nums.length,0,0);
        return sum;
    }
    static public int subsetXORSum(int []nums,int n,int idx,int sum)
    {
        if(idx==n)
        {
            return sum;
        }
        return subsetXORSum(nums,n,idx+1,sum^nums[idx])+subsetXORSum(nums,n,idx+1,sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(subsetXORSum(arr));
    }
}
