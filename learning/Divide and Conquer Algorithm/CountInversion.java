import java.util.Arrays;
import java.util.Scanner;

public class CountInversion {

    public static int Merge(int []arr,int l,int mid,int h)
    {
        // left and right subarray
        int []left = Arrays.copyOfRange(arr,l,mid+1);
        int []right = Arrays.copyOfRange(arr,mid+1,h+1);
        int i=0;
        int swap = 0;
        int j=0;
        int k=l;
        while(i<left.length && j<right.length)
        {
            if(left[i]<=right[j])
            {
                arr[k++]=left[i++];

            }
            else{
                arr[k++]=right[j++];
                // calculate the number of swaps
                swap+=(mid+1)-(l+i);
            }
        }
        while(i<left.length)
        {
            arr[k++]=left[i++];
        }
        while(j<right.length)
        {
            arr[k++]=right[j++];
        }
        return swap;
    }
    public static int CountInversion(int []arr,int l,int h)
    {
        int count =0;
        if(l<h)
        {
            //Divide the problem
            int mid = l+(h-l)/2;
            // conquer the subproblem
            //left array
            count +=CountInversion(arr, l, mid);
            //right array
            count+=CountInversion(arr, mid+1, h);
            //combine the subproblem
            count+=Merge(arr,l,mid,h);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("the Inversion are :"+CountInversion(a,0,(n-1)));
    }
}
