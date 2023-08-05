import java.util.Scanner;

public class Maximumele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            maxi = Math.max(maxi, a[i]); 
        }
        System.out.println("the max :"+maxi);
    }
}
