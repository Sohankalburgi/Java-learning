import java.util.Arrays;
import java.util.Scanner;

public class q4_permutation {

    public static boolean isPossible(int []a,int []b,int n,int k)
    {
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n/2;i++)
        {
            int temp = b[i];
            b[i] = b[n-1-i];
            b[n-1-i] = temp;
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]+b[i]<k)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []a = new int[n];
        int []b = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            b[i] = sc.nextInt();
        }
        System.out.println(isPossible(a,b,n,k)? "Yes":"No");
    }
}
