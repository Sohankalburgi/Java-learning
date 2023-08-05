import java.util.Scanner;

public class maximumNoinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                maxi = Math.max(maxi,a[i][j]);
            }
        }
        System.out.println("the maximum number is :"+maxi);

    }
}
