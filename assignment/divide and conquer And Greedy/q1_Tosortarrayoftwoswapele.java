import java.util.Scanner;

public class q1_Tosortarrayoftwoswapele {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int x = -1;
        int count =1;
        for(int i=1;i<n;i++)
        {
            if(arr[i-1]>arr[i] && count!=2)
            {
                x = i-1;
                count++;
            }
            else if(count==2 && arr[i-1]>arr[i])
            {
                int temp = arr[x];
                arr[x] = arr[i];
                arr[i] = temp;
                break;
            }
        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}