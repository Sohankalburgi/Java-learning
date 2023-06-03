import java.util.Scanner;

public class sumofarrayele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar [] = new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]= sc.nextInt();
        }
        int sum =0;
        for(int i:ar)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}
