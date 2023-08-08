import java.util.Scanner;

public class q5_oddnoofduplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int res =0;
        for(int i=0;i<n;i++)
        {
            res = res ^ a[i];
        }
        System.out.println(res );
    }
}
