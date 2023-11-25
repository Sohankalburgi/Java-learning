import java.util.Scanner;

public class selectionProcedure {

    public static int partition(int []arr,int l,int h)
    {
        int pivot = arr[l];
        int i = l;

        // j -> larger element than pivot
        // i -> smaller element than pivot
        for(int j=i+1;j<=h;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int tem = arr[l];
        arr[l] = arr[i];
        arr[i] = tem;
        return i;
    }

    public static int selectionProcedure(int []arr,int k,int l,int h)
    {
        
            int m = partition(arr,l,h);
            if(m==k-1)
            {
                return arr[m];
            }
            else if(m<k-1)
            {
                return selectionProcedure(arr,k,m+1,h);
            }
            else{
                return selectionProcedure(arr, k, l, m-1);
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
        int k = sc.nextInt();

        System.out.println("the Seletion at kth position :"+ selectionProcedure(arr,k,0,arr.length-1));
    }
}