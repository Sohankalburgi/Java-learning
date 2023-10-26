import java.util.Scanner;

public class multiplication {
    static void multiprint(int n,int k)
    {
        // base condition
        if(k==1)
        {
            System.out.println(n);
            return;
        }
        multiprint(n, k-1);
        System.out.println(n*k);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        multiprint(n,k);
    }
}
