import java.util.Scanner;

public class middlerowcol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int a[][] = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            System.out.print(a[i][(int) m/2]+"\t");
        }
        for(int i=0;i<m;i++)
        {
            System.out.print(a[(int)m/2][i]+"\t");
        }

    }
}
