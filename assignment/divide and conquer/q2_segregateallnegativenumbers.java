import java.util.Scanner;

public class q2_segregateallnegativenumbers {


    public static void partition(int []arr,int start,int end)
    {
        int pivotidx = start;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                int temp = arr[i];
                arr[i] = arr[pivotidx];
                arr[pivotidx] = temp;
                pivotidx++;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        partition(arr,0,n-1);

        for(int i:arr)
        {
            System.out.print(i+" ");
        }

        
    }
}
