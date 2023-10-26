import java.util.*;
public class binarySearchwithlowerbound {

    static public int findfirstOccurence(int [] a,int n,int k)
    {
        int low =0;
        int high = n-1;
        int result=-1;
        while(low<=high)
        {
            //to avoid overflow
            int mid = low+(high-low)/2;
            if(a[mid]==k)
            {
                result = mid;
                //traverse to the left side of an array
                high = mid-1;
            }
            else if(a[mid]>k)
            {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size :");
        int n = sc.nextInt();
        System.out.println("enter the search element :");
        int k = sc.nextInt();
        int []a= new int[n];
        System.out.println("enter the array elements :");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        int result = findfirstOccurence(a,n,k);
        System.out.println(result);

    }
}
