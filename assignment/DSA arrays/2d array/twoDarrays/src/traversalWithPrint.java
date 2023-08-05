import java.util.Scanner;

public class traversalWithPrint {
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
        sc.close();
        System.out.println("the positive numbers");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] > 0) {
                    System.out.println(a[i][j]);
                }
            }
        }

        System.out.println("the negative numbers");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] < 0) {
                    System.out.println(a[i][j]);
                }
            }
        }
        System.out.println("the odd numbers");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j]%2!=0) {
                    System.out.println(a[i][j]);
                }
            }
        }

        System.out.println("the even numbers");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j]%2==0) {
                    System.out.println(a[i][j]);
                }
            }
        }
        int count =0;
        System.out.print("the number of times of 0's : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j]==0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
