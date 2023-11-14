import java.util.*;

public class q4_targetproductcombination {
    
    static boolean isSubsetProductEqualToTarget(int []arr,int k)
    {
        return isSubsetProductEqualToTarget(arr, k,0,1);
    }
    static boolean isSubsetProductEqualToTarget(int []arr,int target,int index,int currentproduct)
    {
        if(index == arr.length)
        {
            return currentproduct==target;
        }
        // Include the current element in the subset product
        if (currentproduct*arr[index]==target) {
            return true;
        }
        // recursively add element or skip the element
        return isSubsetProductEqualToTarget(arr,target,index+1,currentproduct*arr[index]) || isSubsetProductEqualToTarget(arr,target,index+1,currentproduct);
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
        boolean result = isSubsetProductEqualToTarget(arr,k);
        if(result)
        {
            System.out.println("there is subset whose product is equal to target");
        }
        else{
            System.out.println("there is no subset whose product is equal to target");
        }
    }
}
