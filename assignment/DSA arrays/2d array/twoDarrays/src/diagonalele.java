import java.util.Scanner;

public class diagonalele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j || j==n-1-i)
                {
                    continue;
                }
                else{
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
