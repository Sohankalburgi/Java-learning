import java.util.Scanner;

public class quicksort {

    public static void quicksort(int arr[],int l,int h)
    {
        if(l<h)
        {
            // 1. Divide the array into subproblem
            int m = partition(arr,l,h);
            quicksort(arr, l, m-1); // m-1 because m is fixed at position
            quicksort(arr, m+1, h);
        }
        return; 
    }
    public static int partition(int []arr,int l,int h)
    {
        int pivot = arr[l];
        int i=l;
        // j-> larger element than pivot
        // i-> smaller element than pivot
        for(int j=l+1;j<=h;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int tem= arr[l];
        arr[l]=arr[i];
        arr[i]=tem;
        return i;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        quicksort(a,0,n-1);

        System.out.println("Array After sorting is:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}
