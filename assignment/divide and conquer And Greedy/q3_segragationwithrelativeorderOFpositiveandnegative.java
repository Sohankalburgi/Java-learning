import java.util.Scanner;

public class q3_segragationwithrelativeorderOFpositiveandnegative {

    
    public static void segregateelement(int []arr,int n)
    {
        int countNegative = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                countNegative++;
            }
        }

        int i=0; 
        int j=i+1;
        while(i!=countNegative)
        {
            if(arr[i]<0)
            {
                i++;
                j=i+1;
            }
            else if (arr[i] > 0 && j < n) 
            {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                j++;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        segregateelement(arr,n);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }

    }
}
