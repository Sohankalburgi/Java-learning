import java.util.Scanner;

public class q4_sumofarray {

    static int sum(int []a,int i)
    {
        if(i==a.length)
        {
            return 0;
        }
        return a[i]+sum(a,i+1);
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

        System.out.println("the sum :"+sum(a,0));
    }
}
