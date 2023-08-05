import java.util.Scanner;

public class abovethediagonalsecondary {
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
            for(int j=0;j<(int)n/2-i+1;j++)
            {
                System.out.println(a[i][j]);
            }
        }
    }
}

