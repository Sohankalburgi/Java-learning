import java.util.Scanner;

public class q3_maximumeleinarray {

    static int maxele(int []a,int i,int maxi)
    {
        if(i==a.length)
        {
            return maxi;
        }
        if(a[i]>maxi)
        {
            maxi = a[i];
        }
        return maxele(a, i+1, maxi); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        System.out.println("enter the array elements");
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("the maximum value :"+maxele(a,0,a[0]));
    }
}
