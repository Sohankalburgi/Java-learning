import java.util.Scanner;

public class Mergesort
{
    public static void Merge(int []arr,int l,int r,int mid)
    {
        int i,j,k;
        int n1 = mid-l+1;
        int n2 = r-mid;

        int []leftarr = new int[n1];
        int []rightarr = new int[n2];
        for(i=0;i<n1;i++)
        {
            leftarr[i]=arr[l+i];
        }
        for(i=0;i<n2;i++)
        {
            rightarr[i]=arr[mid+1+i];
        }
        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2)
        {
            if(leftarr[i]<rightarr[j])
            {
                arr[k]=leftarr[i];
                k++;
                i++;
            }
            else if (leftarr[i]>rightarr[j])
            {
                arr[k]=rightarr[j];
                k++;
                j++;
            }
        }

            while(i<n1)
            {
                arr[k]=leftarr[i];
                k++;
                i++;
            }
        
        
            while(j<n2)
            {
                arr[k]=rightarr[j];
                k++;
                j++;
            }
    
        return;
    }
    public static void MergeSort(int []arr,int i,int j)
    {
        if(i<j)
        {
            // divide the array to two parts
            int mid = i+(j-i)/2;
            MergeSort(arr,i,mid); // right subarray
            MergeSort(arr,mid+1,j); //left subarray
            Merge(arr,i,j,mid); // combine 
        }
        else{
            return;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        MergeSort(a,0,n-1);
        System.out.println("Array After sorting is:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}